package ru.openschool.plantservice.converter;

import org.springframework.stereotype.Component;
import ru.openschool.plantservice.model.Plant;
import ru.openschool.springkafkaexamplelibrary.dto.PlantResponse;

import java.util.List;

@Component
public class PlantConverter {

    public PlantResponse convert(Plant plant){
        return PlantResponse.builder()
                .id(plant.getId())
                .name(plant.getName())
                .build();
    }

    public List<PlantResponse> convert(List<Plant> plants){
        return plants.stream()
                .map(this::convert)
                .toList();
    }
}
