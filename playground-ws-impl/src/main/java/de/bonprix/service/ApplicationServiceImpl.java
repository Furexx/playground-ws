//package de.bonprix.service;
//
//import java.util.List;
//
//import javax.annotation.Resource;
//
//import de.bonprix.annotation.RestService;
//import de.bonprix.dto.Application;
//import de.bonprix.model.ApplicationEntity;
//import de.bonprix.repository.ApplicationRepositoryImpl;
//import de.bonprix.repository.jpa.ApplicationRepository;
//import de.bonprix.repository.jpa.ApplicationGroupRepository;
//import de.bonprix.repository.jpa.ApplicationTypeRepository;
//import de.bonprix.service.application.ApplicationService;
//import de.bonprix.service.application.fetch.ApplicationFetchOptions;
//import de.bonprix.service.application.filter.ApplicationFilter;
//import org.springframework.security.access.prepost.PreAuthorize;
//
//@RestService
//public class ApplicationServiceImpl
//		extends AbstractFetchService<ApplicationEntity, Application, ApplicationFilter, ApplicationFetchOptions, ApplicationRepository>
//		implements ApplicationService {
//
//	@Resource
//	private ApplicationRepositoryImpl applicationEntityRepository;
//
//	@Resource
//	private ApplicationRepository applicationEntityJpaRepository;
//
//	@Resource
//	private ApplicationTypeRepository applicationTypeEntityJpaRepository;
//
//	@Resource
//	private ApplicationGroupRepository applicationGroupEntityJpaRepository;
//
//	public ApplicationServiceImpl() {
//		super(ApplicationEntity.class, Application.class, ApplicationFilter.class, ApplicationFetchOptions.class);
//	}
//
//	public ApplicationServiceImpl(Class<ApplicationEntity> entityClazz, Class<Application> dtoClazz, Class<ApplicationFilter> filterClazz,
//			Class<ApplicationFetchOptions> fetchOptionsClazz) {
//		super(entityClazz, dtoClazz, filterClazz, fetchOptionsClazz);
//	}
//
//	@PreAuthorize("permitAll")
//	@Override
//	public List<Application> findAll(ApplicationFilter filter, ApplicationFetchOptions fetchOptions) {
//		return super.findAllDefault(filter, fetchOptions);
//	}
//
//	@PreAuthorize("permitAll")
//	@Override
//	public int count(ApplicationFilter filter) {
//		return this.applicationEntityRepository.count(filter);
//	}
//
//	@PreAuthorize("permitAll")
//	@Override
//	public Application findById(Long id, ApplicationFetchOptions fetchOptions) {
//		return super.findByIdDefault(id, fetchOptions);
//	}
//
//	@PreAuthorize("permitAll")
//	@Override
//	public void deleteById(Long id) {
//		super.deleteByIdDefault(id);
//	}
//	@PreAuthorize("permitAll")
//	@Override
//	public long create(Application application) {
//		return super.createDefault(application);
//	}
//	@PreAuthorize("permitAll")
//	@Override
//	public void update(Application application) {
//		super.updateDefault(application.getId(), application);
//	}
//
//	@Override
//	protected ApplicationRepository getRepository() {
//		return this.applicationEntityJpaRepository;
//	}
//
//}
