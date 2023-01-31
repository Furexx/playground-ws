package de.bonprix.service.parkingplace.filter;

import de.bonprix.dto.IdsFilter;
import de.bonprix.model.Paged;

import javax.ws.rs.QueryParam;
import java.util.ArrayList;
import java.util.List;

public class ParkingPlaceFilter extends Paged implements IdsFilter {
    @QueryParam("filterparkingPlaceids")
    private List<Long> parkingPlaceIds;

    @QueryParam("filtercarids")
    private List<Long> carIds;

    public ParkingPlaceFilter() {
        super(DEFAULT_PAGE,DEFAULT_PAGESIZE);
    }

    public ParkingPlaceFilter(Integer page, Integer pageSize) {
        super(page, pageSize);
    }

    public List<Long> getParkingPlaceIds(){
        if(this.parkingPlaceIds == null) {
            this.parkingPlaceIds = new ArrayList<>();
        }
        return this.parkingPlaceIds;
    }

    public List<Long> getCarIds() {
        if (this.carIds == null) {
            this.carIds = new ArrayList<>();
        }
        return this.carIds;
    }

    public void setCarIds(List<Long> carIds) {
        this.carIds = carIds;
    }

    @Override
    public void setIds(List<Long> ids) {
       this.parkingPlaceIds = ids;
    }
}
