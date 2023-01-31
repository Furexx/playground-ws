package de.bonprix.service;

import de.bonprix.annotation.RestService;
import de.bonprix.dto.ParkingZone;
import de.bonprix.model.ParkingEntity;
import de.bonprix.model.ParkingZoneEntity;
import de.bonprix.repository.jpa.ParkingZoneRepository;
import de.bonprix.service.parkingzone.ParkingZoneService;
import de.bonprix.service.parkingzone.filter.ParkingZoneFilter;
import org.springframework.security.access.prepost.PreAuthorize;

import javax.annotation.Resource;
import java.util.List;

@RestService
public class ParkingZoneServiceImpl extends AbstractBasicService<ParkingZoneEntity, ParkingZone, ParkingZoneFilter, ParkingZoneRepository>
implements ParkingZoneService {

    @Resource
    private ParkingZoneRepository parkingZoneRepository;

    public ParkingZoneServiceImpl(){
        super(ParkingZoneEntity.class, ParkingZone.class, ParkingZoneFilter.class);
    }
    public ParkingZoneServiceImpl(Class<ParkingZoneEntity> entityClazz, Class<ParkingZone> dtoClazz, Class<ParkingZoneFilter> filterClazz) {
        super(entityClazz, dtoClazz, filterClazz);
    }

    @Override
    protected ParkingZoneRepository getRepository() {
        return this.parkingZoneRepository;
    }

    @PreAuthorize("permitAll")
    @Override
    public List<ParkingZone> findAll(ParkingZoneFilter filter) {
        return super.findAllDefault(filter);
    }

    @PreAuthorize("permitAll")
    @Override
    public ParkingZone findById(Long id) {
        return super.findByIdDefault(id);
    }

    @PreAuthorize("permitAll")
    @Override
    public void deleteById(Long id) {
        super.deleteByIdDefault(id);
    }

    @PreAuthorize("permitAll")
    @Override
    public long create(ParkingZone parkingZone) {
        return super.createDefault(parkingZone);
    }

    @PreAuthorize("permitAll")
    @Override
    public void update(ParkingZone parkingZone) {
        super.updateDefault(parkingZone.getId(), parkingZone);
    }
}
