//package de.bonprix.service.application;
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
//import de.bonprix.dto.Application;
//import de.bonprix.service.application.fetch.ApplicationFetchOptions;
//import de.bonprix.service.application.filter.ApplicationFilter;
//
//@Path("/applications")
//@Produces(MediaType.APPLICATION_JSON)
//@Consumes(MediaType.APPLICATION_JSON)
//public interface ApplicationService {
//
//	/**
//	 * find all applications with filter and fetch options
//	 *
//	 * @param filter
//	 * @param fetchOptions
//	 * @return list of applications
//	 */
//	@GET
//	@Path("/")
//	List<Application> findAll(@BeanParam @Valid ApplicationFilter filter,
//			@BeanParam @Valid ApplicationFetchOptions fetchOptions);
//
//	/**
//	 * count applications with filter
//	 */
//	@GET
//	@Path("/count")
//	int count(@BeanParam @Valid ApplicationFilter filter);
//
//	/**
//	 * find application by id with fetch options
//	 */
//	@GET
//	@Path("/{id : \\d+}")
//	Application findById(@PathParam("id") @NotNull Long id, @BeanParam @Valid ApplicationFetchOptions fetchOptions);
//
//	/**
//	 * delete application by id
//	 *
//	 * @errorResponse 404 not found
//	 */
//	@DELETE
//	@Path("/{id : \\d+}")
//	void deleteById(@PathParam("id") @NotNull Long id);
//
//	/**
//	 * create application
//	 *
//	 * @errorResponse 400 bad request (can't create application with id)
//	 */
//	@POST
//	@Path("/")
//	long create(@NotNull Application application);
//
//	/**
//	 * update application
//	 *
//	 * @errorResponse 400 bad request (can't update application without id)
//	 * @errorResponse 404 not found
//	 */
//	@PUT
//	@Path("/")
//	void update(@NotNull Application application);
//
//}
