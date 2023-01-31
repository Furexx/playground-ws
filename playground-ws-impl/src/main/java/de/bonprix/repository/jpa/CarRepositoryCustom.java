package de.bonprix.repository.jpa;

import de.bonprix.jpa.BasicRepositoryCustom;
import de.bonprix.model.CarEntity;
import de.bonprix.service.car.filter.CarFilter;

public interface CarRepositoryCustom extends BasicRepositoryCustom<CarEntity, CarFilter> {
}
