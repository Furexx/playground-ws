package de.bonprix.service.parking;

import de.bonprix.dto.Parking;
import de.bonprix.service.parking.filter.ParkingFilter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/parkings")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface ParkingService {
    @GET
    @Path("/")
    List<Parking> findAll(@BeanParam @Valid ParkingFilter filter);

    @GET
    @Path("/{id : \\d+}")
    Parking findById(@PathParam("id") @NotNull Long id);

    @DELETE
    @Path("/{id : \\d+}")
    void deleteById(@PathParam("id") @NotNull Long id);

    @POST
    @Path("/")
    long create(@NotNull Parking parking);

    @PUT
    @Path("/")
    void update(@NotNull Parking parking);
}
