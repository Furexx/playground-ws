//package de.bonprix.service;
//
//import java.util.List;
//
//import javax.annotation.Resource;
//
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.transaction.annotation.Transactional;
//
//import de.bonprix.annotation.RestService;
//import de.bonprix.dto.ApplicationType;
//import de.bonprix.model.ApplicationTypeEntity;
//import de.bonprix.repository.jpa.ApplicationTypeRepository;
//import de.bonprix.service.applicationtype.ApplicationTypeService;
//import de.bonprix.service.applicationtype.filter.ApplicationTypeFilter;
//
//@RestService
//@Transactional
//public class ApplicationTypeServiceImpl
//		extends AbstractBasicService<ApplicationTypeEntity, ApplicationType, ApplicationTypeFilter, ApplicationTypeRepository>
//		implements ApplicationTypeService {
//
//	public ApplicationTypeServiceImpl() {
//		super(ApplicationTypeEntity.class, ApplicationType.class, ApplicationTypeFilter.class);
//	}
//
//	public ApplicationTypeServiceImpl(Class<ApplicationTypeEntity> entityClazz, Class<ApplicationType> dtoClazz, Class<ApplicationTypeFilter> filterClazz) {
//		super(entityClazz, dtoClazz, filterClazz);
//	}
//
//	@Resource
//	private ApplicationTypeRepository applicationTypeEntityJpaRepository;
//
//	@PreAuthorize("permitAll")
//	@Override
//	public List<ApplicationType> findAll(ApplicationTypeFilter filter) {
//		return super.findAllDefault(filter);
//	}
//
//	@PreAuthorize("permitAll")
//	@Override
//	public ApplicationType findById(Long id) {
//		return super.findByIdDefault(id);
//	}
//
//	@PreAuthorize("permitAll")
//	@Override
//	public void deleteById(Long id) {
//		super.deleteByIdDefault(id);
//	}
//
//	@PreAuthorize("permitAll")
//	@Override
//	public long create(ApplicationType applicationType) {
//		return super.createDefault(applicationType);
//	}
//
//	@PreAuthorize("permitAll")
//	@Override
//	public void update(ApplicationType applicationType) {
//		super.updateDefault(applicationType.getId(), applicationType);
//	}
//
//	@Override
//	protected ApplicationTypeRepository getRepository() {
//		return this.applicationTypeEntityJpaRepository;
//	}
//
//}
