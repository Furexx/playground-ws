//package de.bonprix.dto;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//
//import de.bonprix.dto.Entity;
//import net.karneim.pojobuilder.GeneratePojoBuilder;
//
//@GeneratePojoBuilder(intoPackage = "*.builder")
//@JsonIgnoreProperties(ignoreUnknown = true)
//public class Application extends Entity {
//
//	private static final long serialVersionUID = 1L;
//
//	private String name;
//
//	private Long optlock;
//
//	private String scmUrl;
//
//	private ApplicationType applicationType;
//
//	private ApplicationGroup applicationGroup;
//
//	private Long oldId;
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
//	@Override
//	public String toString() {
//		return this.name;
//	}
//
//	public ApplicationType getApplicationType() {
//		return this.applicationType;
//	}
//
//	public void setApplicationType(ApplicationType applicationType) {
//		this.applicationType = applicationType;
//	}
//
//	public ApplicationGroup getApplicationGroup() {
//		return this.applicationGroup;
//	}
//
//	public void setApplicationGroup(ApplicationGroup applicationGroup) {
//		this.applicationGroup = applicationGroup;
//	}
//
//	public String getScmUrl() {
//		return this.scmUrl;
//	}
//
//	public void setScmUrl(String scmUrl) {
//		this.scmUrl = scmUrl;
//	}
//
//	public Long getOldId() {
//		return this.oldId;
//	}
//
//	public void setOldId(Long oldId) {
//		this.oldId = oldId;
//	}
//}
