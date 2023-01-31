//package de.bonprix.service.applicationgroup.filter;
//
//import java.util.List;
//
//import javax.ws.rs.QueryParam;
//
//import de.bonprix.dto.IdsFilter;
//import de.bonprix.model.Paged;
//
//public class ApplicationGroupFilter extends Paged implements IdsFilter {
//
//	@QueryParam("filterapplicationGroupids")
//	private List<Long> applicationGroupIds;
//
//	public ApplicationGroupFilter() {
//		super(DEFAULT_PAGE, DEFAULT_PAGESIZE);
//	}
//
//	public ApplicationGroupFilter(Integer page, Integer pageSize) {
//		super(page, pageSize);
//	}
//
//	@Override
//	public void setIds(List<Long> ids) {
//		this.applicationGroupIds = ids;
//	}
//
//	public List<Long> getApplicationGroupIds() {
//		return this.applicationGroupIds;
//	}
//
//}
