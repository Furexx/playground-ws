//package de.bonprix.service.applicationgroup;
//
//import java.util.List;
//
//import javax.validation.Valid;
//import javax.validation.constraints.NotNull;
//import javax.ws.rs.BeanParam;
//import javax.ws.rs.Consumes;
//import javax.ws.rs.DELETE;
//import javax.ws.rs.GET;
//import javax.ws.rs.POST;
//import javax.ws.rs.PUT;
//import javax.ws.rs.Path;
//import javax.ws.rs.PathParam;
//import javax.ws.rs.Produces;
//import javax.ws.rs.core.MediaType;
//
//import de.bonprix.dto.ApplicationGroup;
//import de.bonprix.service.applicationgroup.filter.ApplicationGroupFilter;
//
//@Path("/applicationgroups")
//@Produces(MediaType.APPLICATION_JSON)
//@Consumes(MediaType.APPLICATION_JSON)
//public interface ApplicationGroupService {
//
//	/**
//	 * find all applicationGroups with filter
//	 *
//	 * @param filter
//	 * @param fetchOptions
//	 * @return list of applicationGroups
//	 */
//	@GET
//	@Path("/")
//	List<ApplicationGroup> findAll(@BeanParam @Valid ApplicationGroupFilter filter);
//
//	/**
//	 * find applicationGroup by id
//	 */
//	@GET
//	@Path("/{id : \\d+}")
//	ApplicationGroup findById(@PathParam("id") @NotNull Long id);
//
//	/**
//	 * delete applicationGroup by id
//	 *
//	 * @errorResponse 404 not found
//	 */
//	@DELETE
//	@Path("/{id : \\d+}")
//	void deleteById(@PathParam("id") @NotNull Long id);
//
//	/**
//	 * create applicationGroup
//	 *
//	 * @errorResponse 400 bad request (can't create applicationGroup with id)
//	 */
//	@POST
//	@Path("/")
//	long create(@NotNull ApplicationGroup applicationGroup);
//
//	/**
//	 * update applicationGroup
//	 *
//	 * @errorResponse 400 bad request (can't update applicationGroup without id)
//	 * @errorResponse 404 not found
//	 */
//	@PUT
//	@Path("/")
//	void update(@NotNull ApplicationGroup applicationGroup);
//}
