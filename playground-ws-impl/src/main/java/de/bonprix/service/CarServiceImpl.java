package de.bonprix.service;

import de.bonprix.annotation.RestService;
import de.bonprix.dto.Car;
import de.bonprix.dto.Entity;
import de.bonprix.model.CarEntity;
import de.bonprix.repository.jpa.CarRepository;
import de.bonprix.service.car.CarService;
import de.bonprix.service.car.filter.CarFilter;
import org.springframework.security.access.prepost.PreAuthorize;

import javax.annotation.Resource;
import java.util.List;

@RestService
public class CarServiceImpl extends AbstractBasicService<CarEntity, Car, CarFilter, CarRepository>
    implements CarService {

    @Resource
    private CarRepository carRepository;

    public CarServiceImpl() {
        super(CarEntity.class, Car.class, CarFilter.class);
    }
    public CarServiceImpl(Class<CarEntity> entityClazz, Class<Car> dtoClazz, Class<CarFilter> filterClazz) {
        super(entityClazz, dtoClazz, filterClazz);
    }

    @Override
    protected CarRepository getRepository() {
        return this.carRepository;
    }

    @PreAuthorize("permitAll")
    @Override
    public List<Car> findAll(CarFilter filter) {
        return super.findAllDefault(filter);
    }

    @PreAuthorize("permitAll")
    @Override
    public Car findById(Long id) {
        return super.findByIdDefault(id);
    }

    @PreAuthorize("permitAll")
    @Override
    public void deleteById(Long id) {
        super.deleteByIdDefault(id);
    }

    @PreAuthorize("permitAll")
    @Override
    public long create(Car car) {
        return super.createDefault(car);
    }

    @PreAuthorize("permitAll")
    @Override
    public void update(Car car) {
        super.updateDefault(car.getId(), car);
    }
}
