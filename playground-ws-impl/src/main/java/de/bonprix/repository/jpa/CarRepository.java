package de.bonprix.repository.jpa;

import de.bonprix.model.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<CarEntity, Long>, CarRepositoryCustom {
}
