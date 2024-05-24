package ru.openschool.metricsconsumerservice.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.openschool.metricsconsumerservice.model.Metric;
import ru.openschool.metricsconsumerservice.repository.MetricRepository;
import ru.openschool.metricsconsumerservice.service.MetricService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MetricServiceImpl implements MetricService {
    private final MetricRepository repository;

    @Override
    public List<Metric> getAll() {
        return repository.findAll();
    }

    @Override
    public Metric getById(Long id) {
        return repository.findById(id)
                .orElse(null);
    }

    @Override
    public Metric save(Metric metric) {
        return repository.save(metric);
    }
}
