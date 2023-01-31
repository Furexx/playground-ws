//package de.bonprix.service.applicationtype.filter;
//
//import java.util.List;
//
//import javax.ws.rs.QueryParam;
//
//import de.bonprix.dto.IdsFilter;
//import de.bonprix.model.Paged;
//
//public class ApplicationTypeFilter extends Paged implements IdsFilter {
//
//	@QueryParam("filterapplicationtypeids")
//	private List<Long> applicationTypeIds;
//
//	public ApplicationTypeFilter() {
//		super(DEFAULT_PAGE, DEFAULT_PAGESIZE);
//	}
//
//	public ApplicationTypeFilter(Integer page, Integer pageSize) {
//		super(page, pageSize);
//	}
//
//	@Override
//	public void setIds(List<Long> ids) {
//		this.applicationTypeIds = ids;
//	}
//
//	public List<Long> getApplicationTypeIds() {
//		return this.applicationTypeIds;
//	}
//
//}
