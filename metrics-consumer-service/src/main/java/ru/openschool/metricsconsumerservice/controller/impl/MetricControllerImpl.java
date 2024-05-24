package ru.openschool.metricsconsumerservice.controller.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import ru.openschool.metricsconsumerservice.controller.MetricController;
import ru.openschool.metricsconsumerservice.converter.MetricConverter;
import ru.openschool.metricsconsumerservice.model.Metric;
import ru.openschool.metricsconsumerservice.service.MetricService;
import ru.openschool.springkafkaexamplelibrary.dto.MetricDto;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MetricControllerImpl implements MetricController {
    private final MetricService service;
    private final MetricConverter converter;

    @Override
    public List<MetricDto> getAll() {
        return converter.convert(
                service.getAll()
        );
    }

    @Override
    public MetricDto getById(Long id) {
        return converter.convert(
                service.getById(id)
        );
    }
}
