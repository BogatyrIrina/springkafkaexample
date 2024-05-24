package ru.openschool.metricsconsumerservice.consumer;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import ru.openschool.metricsconsumerservice.converter.MetricConverter;
import ru.openschool.metricsconsumerservice.service.MetricService;
import ru.openschool.springkafkaexamplelibrary.dto.MetricDto;

@Component
@RequiredArgsConstructor
public class PlantMetricConsumer {
    private final MetricService service;
    private final MetricConverter converter;

    @KafkaListener(topics = "metric", groupId = "metrics-consumer-service")
    public void consume(MetricDto metricDto) {
        service.save(
                converter.convert(metricDto)
        );
    }
}
