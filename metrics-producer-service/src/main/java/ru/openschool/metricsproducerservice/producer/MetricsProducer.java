package ru.openschool.metricsproducerservice.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import ru.openschool.springkafkaexamplelibrary.dto.MetricDto;

@Service
@RequiredArgsConstructor
public class MetricsProducer {
    private final KafkaTemplate<String, MetricDto> template;

    public void send(MetricDto metricDto) {
        template.send("metric", metricDto);
    }
}
