package ru.openschool.metricsproducerservice.client;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;
import ru.openschool.springkafkaexamplelibrary.dto.MetricDto;

@Component
@RequiredArgsConstructor
public class PlantMetricClient {
    private final RestClient restClient;

    public MetricDto getMetricByName(String name) {
        return restClient
                .get()
                .uri("http://localhost:8080/actuator/metrics/{name}", name)
                .retrieve()
                .body(MetricDto.class);
    }
}
