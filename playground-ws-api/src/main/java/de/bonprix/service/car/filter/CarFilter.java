package de.bonprix.service.car.filter;

import de.bonprix.dto.IdsFilter;
import de.bonprix.model.Paged;

import javax.ws.rs.QueryParam;
import java.util.ArrayList;
import java.util.List;

public class CarFilter extends Paged implements IdsFilter {
    @QueryParam("filtercarids")
    private List<Long> carIds;

    @QueryParam("filterparkingPlaceids")
    private List<Long> parkingPlaceIds;

    public CarFilter() {
        super(DEFAULT_PAGE,DEFAULT_PAGESIZE);
    }

    public CarFilter(Integer page, Integer pageSize) {
        super(page, pageSize);
    }

    public List<Long> getCarIds() {
        if (this.carIds == null) {
            this.carIds = new ArrayList<>();
        }
        return carIds;
    }

    public void setCarIds(List<Long> carIds) {
        this.carIds = carIds;
    }

    public List<Long> getParkingPlaceIds() {
        if (this.parkingPlaceIds == null) {
            this.parkingPlaceIds = new ArrayList<>();
        }
        return parkingPlaceIds;
    }

    public void setParkingPlaceIds(List<Long> parkingPlaceIds) {
        this.parkingPlaceIds = parkingPlaceIds;
    }

    @Override
    public void setIds(List<Long> ids) {
        setCarIds(ids);
    }
}
