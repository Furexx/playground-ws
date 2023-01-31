package de.bonprix.service.parking.filter;

import de.bonprix.dto.IdsFilter;
import de.bonprix.model.Paged;

import javax.ws.rs.QueryParam;
import java.util.List;

public class ParkingFilter extends Paged implements IdsFilter {

    @QueryParam("filterparkingids")
    private List<Long> parkingIds;

    @QueryParam("filterparkingname")
    private String parkingName;

    public ParkingFilter(){
        super(DEFAULT_PAGE,DEFAULT_PAGESIZE);
    }

    public ParkingFilter(Integer page,Integer pageSize) {
        super(page, pageSize);
    }
    @Override
    public void setIds(List<Long> ids) {
        this.parkingIds = ids;
    }

    public List<Long> getParkingIds(){
        return this.parkingIds;
    }

    public String getParkingName() {
        return parkingName;
    }

    public void setParkingName(String parkingNames) {
        this.parkingName = parkingName;
    }
}
