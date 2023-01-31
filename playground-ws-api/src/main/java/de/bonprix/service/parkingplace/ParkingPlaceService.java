package de.bonprix.service.parkingplace;

import de.bonprix.dto.ParkingPlace;
import de.bonprix.service.parkingplace.filter.ParkingPlaceFilter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.awt.*;
import java.util.List;

@Path("/parkingplaces")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface ParkingPlaceService {
    @GET
    @Path("/")
    List<ParkingPlace> findAll(@BeanParam @Valid ParkingPlaceFilter filter);

    @GET
    @Path("/{id : \\d+}")
    ParkingPlace findById(@PathParam("id") @NotNull long id);


    @DELETE
    @Path("/{id : \\d+}")
    void deleteById(@PathParam("id") @NotNull long id);

    @POST
    @Path("/")
    long create(@NotNull ParkingPlace parkingPlace);

    @PUT
    @Path("/")
    void update(@NotNull ParkingPlace parkingPlace);
}
