package de.bonprix.repository.jpa;

import de.bonprix.model.ParkingZoneEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingZoneRepository extends JpaRepository<ParkingZoneEntity, Long>, ParkingZoneRepositoryCustom {
}
