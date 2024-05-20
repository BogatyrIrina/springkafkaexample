package ru.openschool.plantservice.controller.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import ru.openschool.plantservice.controller.PlantController;
import ru.openschool.plantservice.converter.PlantConverter;
import ru.openschool.plantservice.service.PlantService;
import ru.openschool.springkafkaexamplelibrary.dto.PlantResponse;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PlantControllerImpl implements PlantController {
    private final PlantService service;
    private final PlantConverter converter;

    @Override
    public List<PlantResponse> getAll() {
        return converter.convert(
                service.getAll()
        );
    }

    @Override
    public PlantResponse getById(Long id) {
        return converter.convert(
                service.getById(id)
        );
    }
}
