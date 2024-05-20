package ru.openschool.plantservice.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.openschool.plantservice.model.Plant;
import ru.openschool.plantservice.repository.PlantRepository;
import ru.openschool.plantservice.service.PlantService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlantServiceImpl implements PlantService {
    private final PlantRepository repository;

    @Override
    public List<Plant> getAll() {
        return repository.findAll();
    }

    @Override
    public Plant getById(Long id) {
        return repository.findById(id)
                .orElse(null);
    }
}
