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
//import de.bonprix.model.ApplicationEntity;
//import de.bonprix.model.QApplicationEntity;
//import de.bonprix.repository.jpa.ApplicationRepositoryCustom;
//import de.bonprix.service.application.fetch.ApplicationFetchOptions;
//import de.bonprix.service.application.filter.ApplicationFilter;
//
//@Component
//public class ApplicationRepositoryImpl implements ApplicationRepositoryCustom {
//
//	@Resource
//	private EntityManager entityManager;
//
//	@Override
//	public List<ApplicationEntity> findAll(ApplicationFilter filter, ApplicationFetchOptions fetchOptions) {
//		if (filter == null) {
//			return Collections.emptyList();
//		}
//
//		final QApplicationEntity applicationEntity = QApplicationEntity.applicationEntity;
//		final JPAQuery<ApplicationEntity> jpaQuery = createJpaQuery(applicationEntity, filter, fetchOptions);
//		/* Handle where clause */
//		final BooleanBuilder builder = handleWhereClause(filter, applicationEntity);
//		final List<ApplicationEntity> applications = jpaQuery.offset(filter.getPage())
//				.where(builder.getValue())
//				.limit(filter.getPageSize())
//				.fetch()
//				.stream()
//				.distinct()
//				.collect(Collectors.toList());
//		return applications;
//	}
//
//	private JPAQuery<ApplicationEntity> createJpaQuery(QApplicationEntity applicationEntity, ApplicationFilter filter, ApplicationFetchOptions fetchOptions) {
//		/* Initial Query */
//		JPAQuery<ApplicationEntity> jpaQuery = getIntialQuery(applicationEntity);
//		/* Handling lazy collections */
//		jpaQuery = handleLazyLoads(fetchOptions, jpaQuery, applicationEntity);
//		return jpaQuery;
//	}
//
//	private JPAQuery<ApplicationEntity> handleLazyLoads(ApplicationFetchOptions fetchOptions, JPAQuery<ApplicationEntity> jpaQuery,
//			QApplicationEntity applicationEntity) {
//		JPAQuery<ApplicationEntity> jpaQueryWithFetchOptions = jpaQuery;
//		/* Dynamic Joins based on the loadConfigs selected */
//		if (fetchOptions.isFetchApplicationType()) {
//			jpaQueryWithFetchOptions = jpaQueryWithFetchOptions.innerJoin(applicationEntity.applicationType)
//					.fetchJoin();
//		}
//		if (fetchOptions.isFetchApplicationGroup()) {
//			jpaQueryWithFetchOptions = jpaQueryWithFetchOptions.innerJoin(applicationEntity.applicationGroup)
//					.fetchJoin();
//		}
//		return jpaQueryWithFetchOptions;
//	}
//
//	@Override
//	public ApplicationEntity findOne(ApplicationFilter filter, ApplicationFetchOptions fetchOptions) {
//		final QApplicationEntity applicationEntity = QApplicationEntity.applicationEntity;
//		final JPAQuery<ApplicationEntity> jpaQuery = createJpaQuery(applicationEntity, filter, fetchOptions);
//		/* Handle where clause */
//		final BooleanBuilder builder = handleWhereClause(filter, applicationEntity);
//		/* Final Query Execution and Result Set Extraction */
//		final List<ApplicationEntity> applications = jpaQuery.where(builder.getValue())
//				.fetch()
//				.stream()
//				.distinct()
//				.collect(Collectors.toList());
//		if (applications == null || applications.isEmpty()) {
//			throw new NotFoundException();
//		}
//		return applications.get(0);
//	}
//
//	private JPAQuery<ApplicationEntity> getIntialQuery(final QApplicationEntity qApplication) {
//		JPAQuery<ApplicationEntity> jpaQuery = new JPAQuery<>(this.entityManager);
//		jpaQuery = jpaQuery.from(qApplication);
//		return jpaQuery;
//	}
//
//	public BooleanBuilder handleWhereClause(final ApplicationFilter filter, final QApplicationEntity qApplication) {
//		/* Dynamic Predicates based on the filters selected */
//		final BooleanBuilder builder = new BooleanBuilder();
//		if (filter != null && filter.getApplicationIds() != null) {
//			builder.and(qApplication.id.in(filter.getApplicationIds()));
//		}
//		if (filter != null && filter.getApplicationTypeIds() != null) {
//			builder.and(qApplication.applicationType.id.in(filter.getApplicationTypeIds()));
//		}
//		if (filter != null && filter.getApplicationGroupIds() != null) {
//			builder.and(qApplication.applicationGroup.id.in(filter.getApplicationGroupIds()));
//		}
//		return builder;
//	}
//
//	@Override
//	public int count(ApplicationFilter filter) {
//		final QApplicationEntity capabilityEntity = QApplicationEntity.applicationEntity;
//		return Math.toIntExact(createJpaQuery(capabilityEntity, filter, new ApplicationFetchOptions()).fetchCount());
//	}
//
//	@Override
//	public List<ApplicationEntity> findAll(ApplicationFilter filter) {
//		return findAll(filter, new ApplicationFetchOptions());
//	}
//
//	@Override
//	public ApplicationEntity findOne(ApplicationFilter filter) {
//		return findOne(filter, new ApplicationFetchOptions());
//	}
//
//}