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
//import de.bonprix.model.ApplicationGroupEntity;
//import de.bonprix.model.QApplicationGroupEntity;
//
//import de.bonprix.repository.jpa.ApplicationGroupRepositoryCustom;
//import de.bonprix.service.applicationgroup.filter.ApplicationGroupFilter;
//
//@Component
//public class ApplicationGroupRepositoryImpl implements ApplicationGroupRepositoryCustom {
//
//	@Resource
//	private EntityManager entityManager;
//
//	@Override
//	public List<ApplicationGroupEntity> findAll(ApplicationGroupFilter filter) {
//		if (filter == null) {
//			return Collections.emptyList();
//		}
//
//		final QApplicationGroupEntity applicationTypeEntity = QApplicationGroupEntity.applicationGroupEntity;
//		final JPAQuery<ApplicationGroupEntity> jpaQuery = createJpaQuery(applicationTypeEntity, filter);
//		final List<ApplicationGroupEntity> applicationTypes = jpaQuery.offset(filter.getPage())
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
//	public ApplicationGroupEntity findOne(ApplicationGroupFilter filter) {
//		final QApplicationGroupEntity applicationTypeEntity = QApplicationGroupEntity.applicationGroupEntity;
//		final JPAQuery<ApplicationGroupEntity> jpaQuery = createJpaQuery(applicationTypeEntity, filter);
//		final List<ApplicationGroupEntity> applicationTypes = jpaQuery.fetch()
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
//	public int count(ApplicationGroupFilter filter) {
//		final QApplicationGroupEntity applicationTypeEntity = QApplicationGroupEntity.applicationGroupEntity;
//		return Math.toIntExact(createJpaQuery(applicationTypeEntity, filter).fetchCount());
//	}
//
//	private JPAQuery<ApplicationGroupEntity> createJpaQuery(final QApplicationGroupEntity qApplicationType,
//			final ApplicationGroupFilter applicationTypeFilter) {
//		/* Initial Query */
//		JPAQuery<ApplicationGroupEntity> jpaQuery = getInitialQuery(qApplicationType);
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
//	private BooleanBuilder handleWhereClause(ApplicationGroupFilter filter, QApplicationGroupEntity qApplicationType) {
//		final BooleanBuilder builder = new BooleanBuilder();
//		if (filter != null && !filter.getApplicationGroupIds()
//				.isEmpty()) {
//			builder.and(qApplicationType.id.in(filter.getApplicationGroupIds()));
//		}
//		return builder;
//	}
//
//	private JPAQuery<ApplicationGroupEntity> getInitialQuery(final QApplicationGroupEntity qApplicationType) {
//		JPAQuery<ApplicationGroupEntity> jpaQuery = new JPAQuery<>(this.entityManager);
//		jpaQuery = jpaQuery.from(qApplicationType);
//		return jpaQuery;
//	}
//
//}
