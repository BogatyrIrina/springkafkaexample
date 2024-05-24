package ru.openschool.metricsconsumerservice.service;

import ru.openschool.metricsconsumerservice.model.Metric;

import java.util.List;

public interface MetricService {
    List<Metric> getAll();
    Metric getById(Long id);
    Metric save(Metric metric);
}
