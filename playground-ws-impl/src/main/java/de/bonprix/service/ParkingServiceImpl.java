package de.bonprix.service;

import de.bonprix.annotation.RestService;
import de.bonprix.dto.Parking;
import de.bonprix.model.ParkingEntity;
import de.bonprix.repository.jpa.ParkingRepository;
import de.bonprix.service.parking.ParkingService;
import de.bonprix.service.parking.filter.ParkingFilter;
import org.springframework.security.access.prepost.PreAuthorize;

import javax.annotation.Resource;
import java.util.List;

@RestService
public class ParkingServiceImpl extends AbstractBasicService<ParkingEntity, Parking, ParkingFilter, ParkingRepository>
    implements ParkingService {

    @Resource
    private ParkingRepository parkingRepository;

    public  ParkingServiceImpl() {
        super(ParkingEntity.class, Parking.class, ParkingFilter.class);
    }
    public ParkingServiceImpl(Class<ParkingEntity> entityClazz, Class<Parking> dtoClazz, Class<ParkingFilter> filterClazz) {
        super(entityClazz, dtoClazz, filterClazz);
    }


    @Override
    protected ParkingRepository getRepository() {
        return this.parkingRepository;
    }

    @PreAuthorize("permitAll")
    @Override
    public List<Parking> findAll(ParkingFilter filter) {
        return super.findAllDefault(filter);
    }

    @PreAuthorize("permitAll")
    @Override
    public Parking findById(Long id) {
        return super.findByIdDefault(id);
    }

    @PreAuthorize("permitAll")
    @Override
    public void deleteById(Long id) {
        super.deleteByIdDefault(id);
    }

    @PreAuthorize("permitAll")
    @Override
    public long create(Parking parking) {
        return super.createDefault(parking);
    }

    @PreAuthorize("permitAll")
    @Override
    public void update(Parking parking) {
        super.updateDefault(parking.getId(), parking);
    }
}
