package de.bonprix.model;

import de.bonprix.dto.Parking;
import de.bonprix.dto.ParkingZone;
import de.bonprix.service.BasicTableDtoConverter;
import de.bonprix.service.DtoEntityConverterUtils;

import javax.persistence.*;

@Entity
@Table(
        name = "PARKINGZONE"

)
@SequenceGenerator(
        name = "SEQ_PARKINGZONE",
        sequenceName = "SEQ_PARKINGZONE",
        allocationSize = 1
)
public class ParkingZoneEntity implements BasicTableDtoConverter<ParkingZone> {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SEQ_PARKINGZONE")
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(
            name = "PARKINGZONE_NAME"
    )
    private String name;

    @ManyToOne()
    @JoinColumn(name = "PARKING_ID")
    private ParkingEntity parking;


    public ParkingEntity getParking() {
        return this.parking;
    }

    public void setParking(ParkingEntity parking) {
        this.parking = parking;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void updateDto(ParkingZone dto) {
        dto.setId(getId());
        dto.setName(getName());
        dto.setParking(DtoEntityConverterUtils.convertToDto(getParking(), Parking.class));
    }
    @Override
    public void updateEntity(ParkingZone dto) {
        setId(dto.getId());
        setName(dto.getName());
        setParking(DtoEntityConverterUtils.convertToEntity(dto.getParking(), ParkingEntity.class));
    }
}