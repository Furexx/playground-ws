package de.bonprix.repository.jpa;

import de.bonprix.model.ParkingPlaceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingPlaceRepository extends JpaRepository<ParkingPlaceEntity, Long>, ParkingPlaceRepositoryCustom {
}
