package ru.openschool.metricsproducerservice.scheduler;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import ru.openschool.metricsproducerservice.client.PlantMetricClient;
import ru.openschool.metricsproducerservice.producer.MetricsProducer;

@RequiredArgsConstructor
@Component
public class PlantMetricScheduler {

    private final PlantMetricClient client;
    private final MetricsProducer producer;

    @Scheduled(fixedRate = 60 * 1000)
    public void schedulePlantMetric() {
         producer.send(
                client.getMetricByName("application.ready.time")
        );
    }
}
