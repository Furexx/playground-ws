package de.bonprix.service.car;

import de.bonprix.dto.Car;
import de.bonprix.service.car.filter.CarFilter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("/cars")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface CarService {

    @GET
    @Path("/")
    List<Car> findAll(@BeanParam @Valid CarFilter filter);

    @GET
    @Path("/{id : \\d+}")
    Car findById(@PathParam("id") @NotNull Long id);

    @DELETE
    @Path("/{id : \\d+}")
    void deleteById(@PathParam("id") @NotNull Long id);

    @POST
    @Path("/")
    long create(@NotNull Car car);

    @PUT
    @Path("/")
    void update(@NotNull Car car);
}
