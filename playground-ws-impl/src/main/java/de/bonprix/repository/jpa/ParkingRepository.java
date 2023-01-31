package de.bonprix.repository.jpa;

import de.bonprix.model.ParkingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingRepository extends JpaRepository<ParkingEntity, Long>, ParkingRepositoryCustom {
}
