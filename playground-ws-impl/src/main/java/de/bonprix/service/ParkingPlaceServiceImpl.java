package de.bonprix.service;

import de.bonprix.annotation.RestService;
import de.bonprix.dto.ParkingPlace;
import de.bonprix.model.CarEntity;
import de.bonprix.model.ParkingPlaceEntity;
import de.bonprix.repository.jpa.CarRepository;
import de.bonprix.repository.jpa.ParkingPlaceRepository;
import de.bonprix.service.parkingplace.ParkingPlaceService;
import de.bonprix.service.parkingplace.filter.ParkingPlaceFilter;
import org.springframework.security.access.prepost.PreAuthorize;

import javax.annotation.Resource;
import java.util.List;
@RestService
public class ParkingPlaceServiceImpl extends AbstractBasicService<ParkingPlaceEntity, ParkingPlace, ParkingPlaceFilter, ParkingPlaceRepository>
    implements ParkingPlaceService {

    @Resource
    private ParkingPlaceRepository parkingPlaceRepository;


    public ParkingPlaceServiceImpl() {
        super(ParkingPlaceEntity.class, ParkingPlace.class, ParkingPlaceFilter.class);
    }
    public ParkingPlaceServiceImpl(Class<ParkingPlaceEntity> entityClazz, Class<ParkingPlace> dtoClazz, Class<ParkingPlaceFilter> filterClazz) {
        super(entityClazz, dtoClazz, filterClazz);
    }

    @Override
    protected ParkingPlaceRepository getRepository() {
        return this.parkingPlaceRepository;
    }

    @PreAuthorize("permitAll")
    @Override
    public List<ParkingPlace> findAll(ParkingPlaceFilter filter) {
        return super.findAllDefault(filter);
    }


    @PreAuthorize("permitAll")
    @Override
    public ParkingPlace findById(long id) {
        return super.findByIdDefault(id);
    }

    @PreAuthorize("permitAll")
    @Override
    public void deleteById(long id) {
        super.deleteByIdDefault(id);
    }

    @PreAuthorize("permitAll")
    @Override
    public long create(ParkingPlace parkingPlace) {
        return super.createDefault(parkingPlace);
    }

    @PreAuthorize("permitAll")
    @Override
    public void update(ParkingPlace parkingPlace) {
      super.updateDefault(parkingPlace.getId(),parkingPlace);
    }
}


