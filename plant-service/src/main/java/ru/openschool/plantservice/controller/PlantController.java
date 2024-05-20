package ru.openschool.plantservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.openschool.springkafkaexamplelibrary.dto.PlantResponse;

import java.util.List;

import static ru.openschool.springkafkaexamplelibrary.constant.UrlConstant.API_V1_PLANTS_URL;
import static ru.openschool.springkafkaexamplelibrary.constant.UrlConstant.PATH_VARIABLE_ID;
import static ru.openschool.springkafkaexamplelibrary.constant.UrlConstant.PATH_VARIABLE_ID_URL;

@RequestMapping(API_V1_PLANTS_URL)
public interface PlantController {

    @GetMapping
    List<PlantResponse> getAll();

    @GetMapping(PATH_VARIABLE_ID_URL)
    PlantResponse getById(
            @PathVariable(PATH_VARIABLE_ID) Long id
    );
}
