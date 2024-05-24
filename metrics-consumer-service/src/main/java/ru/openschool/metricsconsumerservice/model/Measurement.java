package ru.openschool.metricsconsumerservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static ru.openschool.metricsconsumerservice.constant.ColumnConstant.ID;
import static ru.openschool.metricsconsumerservice.constant.ColumnConstant.STATISTIC;
import static ru.openschool.metricsconsumerservice.constant.ColumnConstant.VALUE;
import static ru.openschool.metricsconsumerservice.constant.TableConstant.MEASUREMENT;

@Table(name = MEASUREMENT)
@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Measurement {

    @Id
    @Column(name = ID)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = STATISTIC)
    private String statistic;

    @Column(name = VALUE)
    private Double value;
}
