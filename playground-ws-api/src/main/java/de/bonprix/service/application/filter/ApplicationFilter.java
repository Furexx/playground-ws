//package de.bonprix.service.application.filter;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.ws.rs.QueryParam;
//
//import de.bonprix.dto.IdsFilter;
//import de.bonprix.model.Paged;
//
//public class ApplicationFilter extends Paged implements IdsFilter {
//
//	/**
//	 * @description applicationIds filter list
//	 */
//	@QueryParam("filterapplicationids")
//	private List<Long> applicationIds;
//
//	/**
//	 * @description applicationTypeIds filter list
//	 */
//	@QueryParam("filterapplicationtypeids")
//	private List<Long> applicationTypeIds;
//
//	/**
//	 * @description applicationGroupIds filter list
//	 */
//	@QueryParam("filterapplicationgroupids")
//	private List<Long> applicationGroupIds;
//
//	public ApplicationFilter() {
//		super(DEFAULT_PAGE, DEFAULT_PAGESIZE);
//	}
//
//	public ApplicationFilter(Integer page, Integer pageSize) {
//		super(page, pageSize);
//	}
//
//	public List<Long> getApplicationIds() {
//		if (this.applicationIds == null) {
//			this.applicationIds = new ArrayList<>();
//		}
//		return this.applicationIds;
//	}
//
//	public void setApplicationIds(List<Long> applicationIds) {
//		this.applicationIds = applicationIds;
//	}
//
//	public List<Long> getApplicationTypeIds() {
//		if (this.applicationTypeIds == null) {
//			this.applicationTypeIds = new ArrayList<>();
//		}
//		return this.applicationTypeIds;
//	}
//
//	public void setApplicationTypeIds(List<Long> applicationTypeIds) {
//		this.applicationTypeIds = applicationTypeIds;
//	}
//
//	public List<Long> getApplicationGroupIds() {
//		if (this.applicationGroupIds == null) {
//			this.applicationGroupIds = new ArrayList<>();
//		}
//		return this.applicationGroupIds;
//	}
//
//	public void setApplicationGroupIds(List<Long> applicationGroupIds) {
//		this.applicationGroupIds = applicationGroupIds;
//	}
//
//	@Override
//	public void setIds(List<Long> ids) {
//		setApplicationIds(ids);
//	}
//
//}
