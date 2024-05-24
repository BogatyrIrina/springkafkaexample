package ru.openschool.metricsconsumerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.openschool.metricsconsumerservice.model.Metric;

public interface MetricRepository extends JpaRepository<Metric, Long> {
}