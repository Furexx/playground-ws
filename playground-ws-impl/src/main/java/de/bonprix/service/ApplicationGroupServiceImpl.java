//package de.bonprix.service;
//
//import java.util.List;
//
//import javax.annotation.Resource;
//
//import de.bonprix.annotation.RestService;
//import de.bonprix.dto.ApplicationGroup;
//import de.bonprix.model.ApplicationGroupEntity;
//import de.bonprix.repository.jpa.ApplicationGroupRepository;
//import de.bonprix.service.applicationgroup.ApplicationGroupService;
//import de.bonprix.service.applicationgroup.filter.ApplicationGroupFilter;
//import org.springframework.security.access.prepost.PreAuthorize;
//
//@RestService
//public class ApplicationGroupServiceImpl
//		extends AbstractBasicService<ApplicationGroupEntity, ApplicationGroup, ApplicationGroupFilter, ApplicationGroupRepository>
//		implements ApplicationGroupService {
//
//	@Resource
//	private ApplicationGroupRepository applicationGroupEntityJpaRepository;
//
//	public ApplicationGroupServiceImpl() {
//		super(ApplicationGroupEntity.class, ApplicationGroup.class, ApplicationGroupFilter.class);
//	}
//
//	public ApplicationGroupServiceImpl(Class<ApplicationGroupEntity> entityClazz, Class<ApplicationGroup> dtoClazz, Class<ApplicationGroupFilter> filterClazz) {
//		super(entityClazz, dtoClazz, filterClazz);
//	}
//
//	@PreAuthorize("permitAll")
//	@Override
//	public List<ApplicationGroup> findAll(ApplicationGroupFilter filter) {
//		return super.findAllDefault(filter);
//	}
//
//	@PreAuthorize("permitAll")
//	@Override
//	public ApplicationGroup findById(Long id) {
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
//	public long create(ApplicationGroup applicationGroup) {
//		return super.createDefault(applicationGroup);
//	}
//
//	@PreAuthorize("permitAll")
//	@Override
//	public void update(ApplicationGroup applicationGroup) {
//		super.updateDefault(applicationGroup.getId(), applicationGroup);
//	}
//
//	@Override
//	protected ApplicationGroupRepository getRepository() {
//		return this.applicationGroupEntityJpaRepository;
//	}
//
//}
