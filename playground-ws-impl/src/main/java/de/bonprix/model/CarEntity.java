package de.bonprix.model;

import de.bonprix.dto.Car;
import de.bonprix.service.BasicTableDtoConverter;

import javax.persistence.*;

@Entity
@Table(
        name = "CAR")
@SequenceGenerator(
        name = "SEQ_CAR",
        sequenceName = "SEQ_CAR",
        allocationSize = 1
)
public class CarEntity implements BasicTableDtoConverter<Car> {

    @Id
    @GeneratedValue(
            generator = "SEQ_CAR",
            strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(
            name = "CAR_PLATENUMBER"
    )
    private String plateNumber;


    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }


    @Override
    public void updateDto(Car dto) {
        dto.setId(getId());
        dto.setPlateNumber(getPlateNumber());
    }

    @Override
    public void updateEntity(Car dto) {
        setId(dto.getId());
        setPlateNumber(dto.getPlateNumber());

    }

}
