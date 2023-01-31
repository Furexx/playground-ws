//package de.bonprix.model;
//
//import java.util.Set;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//import javax.persistence.Version;
//
//import de.bonprix.dto.ApplicationGroup;
//import de.bonprix.service.BasicTableDtoConverter;
//import net.karneim.pojobuilder.GeneratePojoBuilder;
//
//@GeneratePojoBuilder(
//		intoPackage = "*.builder")
//@Entity
//@Table(
//		name = "MD_APPLICATIONGROUP",
//		schema = "DS_GLOBAL")
//@SequenceGenerator(
//		schema = "DS_GLOBAL",
//		name = "SEQ_MD_APPLICATIONGROUP",
//		sequenceName = "DS_GLOBAL.SEQ_MD_APPLICATIONGROUP",
//		allocationSize = 1)
//public class ApplicationGroupEntity implements BasicTableDtoConverter<ApplicationGroup> {
//
//	@Id
//	@GeneratedValue(
//			generator = "SEQ_MD_APPLICATIONGROUP",
//			strategy = GenerationType.SEQUENCE)
//	@Column(
//			name = "MD_APPLICATIONGROUP_ID")
//	private Long id;
//
//	@Column(
//			name = "MD_APPLICATIONGROUP_NAME_KEY")
//	private String nameKey;
//
//	@Column(
//			name = "SORT_PRIO")
//	private Long sortPrio;
//
//	@Version
//	@Column(
//			name = "OPTLOCK",
//			nullable = false,
//			columnDefinition = "Number(18) default '0'")
//	private Long optlock;
//
//	@OneToMany(
//			mappedBy = "applicationGroup")
//	private Set<ApplicationEntity> applications;
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
//	public String getNameKey() {
//		return this.nameKey;
//	}
//
//	public void setNameKey(final String nameKey) {
//		this.nameKey = nameKey;
//	}
//
//	public Long getSortPrio() {
//		return this.sortPrio;
//	}
//
//	public void setSortPrio(Long sortPrio) {
//		this.sortPrio = sortPrio;
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
//	public Set<ApplicationEntity> getApplications() {
//		return this.applications;
//	}
//
//	public void setApplications(Set<ApplicationEntity> applications) {
//		this.applications = applications;
//	}
//
//	@Override
//	public void updateDto(ApplicationGroup dto) {
//		dto.setId(getId());
//		dto.setNameKey(getNameKey());
//		dto.setOptlock(getOptlock());
//		dto.setSortPrio(getSortPrio());
//	}
//
//	@Override
//	public void updateEntity(ApplicationGroup dto) {
//		setId(dto.getId());
//		setNameKey(dto.getNameKey());
//		setOptlock(dto.getOptlock());
//		setSortPrio(dto.getSortPrio());
//	}
//
//}
