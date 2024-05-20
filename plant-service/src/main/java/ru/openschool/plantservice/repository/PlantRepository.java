package ru.openschool.plantservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.openschool.plantservice.model.Plant;

public interface PlantRepository extends JpaRepository<Plant, Long> {
}
