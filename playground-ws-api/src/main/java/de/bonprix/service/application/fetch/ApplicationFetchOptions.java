//package de.bonprix.service.application.fetch;
//
//import javax.ws.rs.QueryParam;
//
//import de.bonprix.dto.FetchAllOptions;
//import net.karneim.pojobuilder.GeneratePojoBuilder;
//
//@GeneratePojoBuilder(
//		intoPackage = "*.builder")
////public class ApplicationFetchOptions implements FetchAllOptions {
//
//	/**
//	 * @description fetch applicationType property of returning application(s)
//	 */
//	@QueryParam("fetchapplicationtype")
//	private boolean fetchApplicationType = false;
//
//	/**
//	 * @description fetch applicationGroup property of returning application(s)
//	 */
//	@QueryParam("fetchapplicationgroup")
//	private boolean fetchApplicationGroup = false;
//
//	public boolean isFetchApplicationType() {
//		return this.fetchApplicationType;
//	}
//
//	public void setFetchApplicationType(boolean fetchApplicationType) {
//		this.fetchApplicationType = fetchApplicationType;
//	}
//
//	public boolean isFetchApplicationGroup() {
//		return this.fetchApplicationGroup;
//	}
//
//	public void setFetchApplicationGroup(boolean fetchApplicationGroup) {
//		this.fetchApplicationGroup = fetchApplicationGroup;
//	}
//
//	public ApplicationFetchOptions withFetchAll() {
//		setFetchApplicationType(true);
//		setFetchApplicationGroup(true);
//		return this;
//	}
//
//	@Override
//	public void setFetchAll() {
//		setFetchApplicationGroup(true);
//		setFetchApplicationType(true);
//	}
//
//}
