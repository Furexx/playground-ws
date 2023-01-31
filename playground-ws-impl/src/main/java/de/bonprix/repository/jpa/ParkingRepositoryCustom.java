package de.bonprix.repository.jpa;

import de.bonprix.jpa.BasicRepositoryCustom;
import de.bonprix.model.ParkingEntity;
import de.bonprix.service.parking.filter.ParkingFilter;

public interface ParkingRepositoryCustom extends BasicRepositoryCustom<ParkingEntity, ParkingFilter> {
}
