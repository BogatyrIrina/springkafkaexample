package ru.openschool.springkafkaexamplelibrary.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MetricDto {
    private String name;
    private String description;
    private String baseUnit;
    private List<MeasurementDto> measurementDtos;
    private List<AvailableTagDto> availableTagDtos;
}
