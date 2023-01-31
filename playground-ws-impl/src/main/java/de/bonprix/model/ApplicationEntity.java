//package de.bonprix.model;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//import javax.persistence.Version;
//
//import de.bonprix.dto.Application;
//import de.bonprix.dto.ApplicationGroup;
//import de.bonprix.dto.ApplicationType;
//import de.bonprix.service.DtoEntityConverterUtils;
//import de.bonprix.service.FetchTableDtoConverter;
//import de.bonprix.service.application.fetch.ApplicationFetchOptions;
//import net.karneim.pojobuilder.GeneratePojoBuilder;
//
//@GeneratePojoBuilder(
//		intoPackage = "*.builder")
//@Entity
//@Table(
//		name = "MD_APPLICATION",
//		schema = "DS_GLOBAL")
//@SequenceGenerator(
//		schema = "DS_GLOBAL",
//		name = "SEQ_MD_APPLICATION",
//		sequenceName = "DS_GLOBAL.SEQ_MD_APPLICATION",
//		allocationSize = 1)
//public class ApplicationEntity implements FetchTableDtoConverter<Application, ApplicationFetchOptions> {
//
//	@Id
//	@GeneratedValue(
//			generator = "SEQ_MD_APPLICATION",
//			strategy = GenerationType.SEQUENCE)
//	@Column(
//			name = "MD_APPLICATION_ID")
//	private Long id;
//
//	@Column(
//			name = "MD_APPLICATION_NAME")
//	private String name;
//
//	@ManyToOne(
//			fetch = FetchType.LAZY)
//	@JoinColumn(
//			name = "MD_APPLICATIONTYPE_ID")
//	private ApplicationTypeEntity applicationType;
//
//	@ManyToOne(
//			fetch = FetchType.LAZY)
//	@JoinColumn(
//			name = "MD_APPLICATIONGROUP_ID")
//	private ApplicationGroupEntity applicationGroup;
//
//	@Version
//	@Column(
//			name = "OPTLOCK",
//			nullable = false,
//			columnDefinition = "Number(18) default '0'")
//	private Long optlock;
//
//	@Column(
//			name = "SCM_URL")
//	private String scmUrl;
//
//	@Column(
//			name = "OLD_APPLICATION_ID")
//	private Long oldId;
//
//	public String getScmUrl() {
//		return this.scmUrl;
//	}
//
//	public void setScmUrl(String scmUrl) {
//		this.scmUrl = scmUrl;
//	}
//
//	@Override
//	public Long getId() {
//		return this.id;
//	}
//
//	@Override
//	public void setId(final Long id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return this.name;
//	}
//
//	public void setName(final String name) {
//		this.name = name;
//	}
//
//	public Long getOptlock() {
//		return this.optlock;
//	}
//
//	public void setOptlock(final Long optlock) {
//		this.optlock = optlock;
//	}
//
//	public ApplicationTypeEntity getApplicationType() {
//		return this.applicationType;
//	}
//
//	public void setApplicationType(ApplicationTypeEntity applicationType) {
//		this.applicationType = applicationType;
//	}
//
//	public ApplicationGroupEntity getApplicationGroup() {
//		return this.applicationGroup;
//	}
//
//	public void setApplicationGroup(ApplicationGroupEntity applicationGroup) {
//		this.applicationGroup = applicationGroup;
//	}
//
//	public Long getOldId() {
//		return this.oldId;
//	}
//
//	public void setOldId(Long oldId) {
//		this.oldId = oldId;
//	}
//
//	@Override
//	public void updateDto(Application dto) {
//		updateDto(dto, new ApplicationFetchOptions());
//	}
//
//	@Override
//	public void updateEntity(Application dto) {
//		setId(dto.getId());
//		setName(dto.getName());
//		setOldId(dto.getOldId());
//		setOptlock(dto.getOptlock());
//		setScmUrl(dto.getScmUrl());
//		setApplicationGroup(DtoEntityConverterUtils.convertToEntity(dto.getApplicationGroup(), ApplicationGroupEntity.class));
//		setApplicationType(DtoEntityConverterUtils.convertToEntity(dto.getApplicationType(), ApplicationTypeEntity.class));
//	}
//
//	@Override
//	public void updateDto(Application dto, ApplicationFetchOptions fetchOptions) {
//		dto.setId(getId());
//		dto.setName(getName());
//		dto.setOldId(getOldId());
//		dto.setOptlock(getOptlock());
//		dto.setScmUrl(getScmUrl());
//		if (fetchOptions.isFetchApplicationGroup()) {
//			dto.setApplicationGroup(DtoEntityConverterUtils.convertToDto(getApplicationGroup(), ApplicationGroup.class));
//		}
//		if (fetchOptions.isFetchApplicationType()) {
//			dto.setApplicationType(DtoEntityConverterUtils.convertToDto(getApplicationType(), ApplicationType.class));
//		}
//	}
//}
