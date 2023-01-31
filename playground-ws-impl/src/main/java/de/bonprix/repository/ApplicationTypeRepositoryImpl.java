//package de.bonprix.repository;
//
//import java.util.Collections;
//import java.util.List;
//import java.util.stream.Collectors;
//
//import javax.annotation.Resource;
//import javax.persistence.EntityManager;
//import javax.ws.rs.NotFoundException;
//
//import org.springframework.stereotype.Component;
//
//import com.querydsl.core.BooleanBuilder;
//import com.querydsl.jpa.impl.JPAQuery;
//
//import de.bonprix.model.ApplicationTypeEntity;
//import de.bonprix.model.QApplicationTypeEntity;
//import de.bonprix.repository.jpa.ApplicationTypeRepositoryCustom;
//import de.bonprix.service.applicationtype.filter.ApplicationTypeFilter;
//
//@Component
//public class ApplicationTypeRepositoryImpl implements ApplicationTypeRepositoryCustom {
//
//	@Resource
//	private EntityManager entityManager;
//
//	@Override
//	public List<ApplicationTypeEntity> findAll(ApplicationTypeFilter filter) {
//		if (filter == null) {
//			return Collections.emptyList();
//		}
//
//		final QApplicationTypeEntity applicationTypeEntity = QApplicationTypeEntity.applicationTypeEntity;
//		final JPAQuery<ApplicationTypeEntity> jpaQuery = createJpaQuery(applicationTypeEntity, filter);
//		final List<ApplicationTypeEntity> applicationTypes = jpaQuery.offset(filter.getPage())
//				.limit(filter.getPageSize())
//				.fetch()
//				.stream()
//				.distinct()
//				.collect(Collectors.toList());
//		if (applicationTypes == null || applicationTypes.isEmpty()) {
//			throw new NotFoundException();
//		}
//		return applicationTypes;
//	}
//
//	@Override
//	public ApplicationTypeEntity findOne(ApplicationTypeFilter filter) {
//		final QApplicationTypeEntity applicationTypeEntity = QApplicationTypeEntity.applicationTypeEntity;
//		final JPAQuery<ApplicationTypeEntity> jpaQuery = createJpaQuery(applicationTypeEntity, filter);
//		final List<ApplicationTypeEntity> applicationTypes = jpaQuery.fetch()
//				.stream()
//				.distinct()
//				.collect(Collectors.toList());
//		if (applicationTypes == null || applicationTypes.isEmpty()) {
//			throw new NotFoundException();
//		}
//		return applicationTypes.get(0);
//
//	}
//
//	@Override
//	public int count(ApplicationTypeFilter filter) {
//		final QApplicationTypeEntity applicationTypeEntity = QApplicationTypeEntity.applicationTypeEntity;
//		return Math.toIntExact(createJpaQuery(applicationTypeEntity, filter).fetchCount());
//	}
//
//	private JPAQuery<ApplicationTypeEntity> createJpaQuery(final QApplicationTypeEntity qApplicationType, final ApplicationTypeFilter applicationTypeFilter) {
//		/* Initial Query */
//		JPAQuery<ApplicationTypeEntity> jpaQuery = getInitialQuery(qApplicationType);
//
//		/* Handle where clause */
//		final BooleanBuilder builder = handleWhereClause(applicationTypeFilter, qApplicationType);
//
//		/* Final Query Execution and Result Set Extraction */
//		jpaQuery = jpaQuery.where(builder);
//
//		return jpaQuery;
//
//	}
//
//	private BooleanBuilder handleWhereClause(ApplicationTypeFilter filter, QApplicationTypeEntity qApplicationType) {
//		final BooleanBuilder builder = new BooleanBuilder();
//		if (filter != null && !filter.getApplicationTypeIds()
//				.isEmpty()) {
//			builder.and(qApplicationType.id.in(filter.getApplicationTypeIds()));
//		}
//		return builder;
//	}
//
//	private JPAQuery<ApplicationTypeEntity> getInitialQuery(final QApplicationTypeEntity qApplicationType) {
//		JPAQuery<ApplicationTypeEntity> jpaQuery = new JPAQuery<>(this.entityManager);
//		jpaQuery = jpaQuery.from(qApplicationType);
//		return jpaQuery;
//	}
//}
