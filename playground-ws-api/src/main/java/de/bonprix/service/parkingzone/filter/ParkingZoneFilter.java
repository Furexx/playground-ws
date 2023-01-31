package de.bonprix.service.parkingzone.filter;

import de.bonprix.dto.IdsFilter;
import de.bonprix.model.Paged;

import javax.ws.rs.QueryParam;
import java.util.ArrayList;
import java.util.List;

public class ParkingZoneFilter extends Paged implements IdsFilter {
    @QueryParam("filterparkingZoneids")
    private List<Long> parkingZoneIds;

    @QueryParam("filterparkingids")
    private List<Long> parkingIds;

    public ParkingZoneFilter() {
        super(DEFAULT_PAGE,DEFAULT_PAGESIZE);
    }

    public ParkingZoneFilter(Integer page, Integer pageSize) {
        super(page, pageSize);
    }

    @Override
    public void setIds(List<Long> ids) {
        this.parkingZoneIds = ids;
    }

    public List<Long> getParkingZoneIds() {
        if (this.parkingZoneIds == null) {
            this.parkingZoneIds = new ArrayList<>();
        }
        return this.parkingZoneIds;
    }

    public List<Long> getParkingIds(){
        return this.parkingIds;
    }
}
