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

import static ru.openschool.metricsconsumerservice.constant.ColumnConstant.ID;
import static ru.openschool.metricsconsumerservice.constant.ColumnConstant.TAG;
import static ru.openschool.metricsconsumerservice.constant.ColumnConstant.VALUE_ID;
import static ru.openschool.metricsconsumerservice.constant.TableConstant.AVAILABLE_TAG;

@Table(name = AVAILABLE_TAG)
@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AvailableTag {

    @Id
    @Column(name = ID)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = TAG)
    private String tag;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = VALUE_ID)
    private List<Value> values;
}
