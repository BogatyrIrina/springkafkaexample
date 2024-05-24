package ru.openschool.metricsconsumerservice.converter;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.openschool.metricsconsumerservice.model.Metric;
import ru.openschool.metricsconsumerservice.model.Metric.MetricBuilder;
import ru.openschool.springkafkaexamplelibrary.dto.MetricDto;
import ru.openschool.springkafkaexamplelibrary.dto.MetricDto.MetricDtoBuilder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-24T19:34:00+0300",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class MetricConverterImpl implements MetricConverter {

    @Override
    public MetricDto convert(Metric metric) {
        if ( metric == null ) {
            return null;
        }

        MetricDtoBuilder metricDto = MetricDto.builder();

        metricDto.name( metric.getName() );
        metricDto.description( metric.getDescription() );
        metricDto.baseUnit( metric.getBaseUnit() );

        return metricDto.build();
    }

    @Override
    public List<MetricDto> convert(List<Metric> metrics) {
        if ( metrics == null ) {
            return null;
        }

        List<MetricDto> list = new ArrayList<MetricDto>( metrics.size() );
        for ( Metric metric : metrics ) {
            list.add( convert( metric ) );
        }

        return list;
    }

    @Override
    public Metric convert(MetricDto dto) {
        if ( dto == null ) {
            return null;
        }

        MetricBuilder metric = Metric.builder();

        metric.name( dto.getName() );
        metric.description( dto.getDescription() );
        metric.baseUnit( dto.getBaseUnit() );

        return metric.build();
    }
}
