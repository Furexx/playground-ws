package de.bonprix.service.parkingzone;

import de.bonprix.dto.ParkingZone;
import de.bonprix.service.parkingzone.filter.ParkingZoneFilter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/parkingzones")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface ParkingZoneService {
    @GET
    @Path("/")
    List<ParkingZone> findAll(@BeanParam @Valid ParkingZoneFilter filter);

    @GET
    @Path("/{id : \\d+}")
    ParkingZone findById(@PathParam("id") @NotNull Long id);

    @DELETE
    @Path("/{id : \\d+}")
    void deleteById(@PathParam("id") @NotNull Long id);

    @POST
    @Path("/")
    long create(@NotNull ParkingZone parkingZone);

    @PUT
    @Path("/")
    void update(@NotNull ParkingZone parkingZone);
}
