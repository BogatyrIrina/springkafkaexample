package ru.openschool.metricsconsumerservice.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import static ru.openschool.metricsconsumerservice.constant.ColumnConstant.AVAILABLE_TAG_ID;
import static ru.openschool.metricsconsumerservice.constant.ColumnConstant.BASE_UNIT;
import static ru.openschool.metricsconsumerservice.constant.ColumnConstant.DESCRIPTION;
import static ru.openschool.metricsconsumerservice.constant.ColumnConstant.ID;
import static ru.openschool.metricsconsumerservice.constant.ColumnConstant.MEASUREMENT_ID;
import static ru.openschool.metricsconsumerservice.constant.ColumnConstant.NAME;
import static ru.openschool.metricsconsumerservice.constant.TableConstant.METRIC;

@Table(name = METRIC)
@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Metric {

    @Id
    @Column(name = ID)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = NAME)
    private String name;

    @Column(name = DESCRIPTION)
    private String description;

    @Column(name = BASE_UNIT)
    private String baseUnit;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = MEASUREMENT_ID)
    private List<Measurement> measurements;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = AVAILABLE_TAG_ID)
    private List<AvailableTag> availableTags;
}
