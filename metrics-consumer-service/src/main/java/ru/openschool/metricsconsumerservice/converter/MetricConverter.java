package ru.openschool.metricsconsumerservice.converter;

import org.mapstruct.Mapper;
import ru.openschool.metricsconsumerservice.model.Metric;
import ru.openschool.springkafkaexamplelibrary.dto.MetricDto;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MetricConverter {
    MetricDto convert(Metric metric);
    List<MetricDto> convert(List<Metric> metrics);

    Metric convert(MetricDto dto);
}
