package ru.openschool.plantservice.service;

import ru.openschool.plantservice.model.Plant;

import java.util.List;

public interface PlantService {
    List<Plant> getAll();
    Plant getById(Long id);
}
