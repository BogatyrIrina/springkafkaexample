package ru.openschool.metricsconsumerservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.openschool.metricsconsumerservice.model.Metric;
import ru.openschool.springkafkaexamplelibrary.dto.MetricDto;

import java.util.List;

import static ru.openschool.springkafkaexamplelibrary.constant.UrlConstant.METRIC_URL;
import static ru.openschool.springkafkaexamplelibrary.constant.UrlConstant.PATH_VARIABLE_ID;
import static ru.openschool.springkafkaexamplelibrary.constant.UrlConstant.PATH_VARIABLE_ID_URL;

@RequestMapping(METRIC_URL)
public interface MetricController {

    @GetMapping
    List<MetricDto> getAll();

    @GetMapping(PATH_VARIABLE_ID_URL)
    MetricDto getById(@PathVariable(PATH_VARIABLE_ID) Long id);
}
