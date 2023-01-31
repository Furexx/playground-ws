package de.bonprix.model;

import de.bonprix.dto.Car;
import de.bonprix.dto.ParkingPlace;
import de.bonprix.dto.ParkingZone;
import de.bonprix.service.BasicTableDtoConverter;
import de.bonprix.service.DtoEntityConverterUtils;

import javax.persistence.*;

@Entity
@Table(name = "PARKINGPLACE")
@SequenceGenerator(

        name = "SEQ_PARKINGPLACE",
        sequenceName = "SEQ_PARKINGPLACE",
        allocationSize = 1
)
public class ParkingPlaceEntity implements BasicTableDtoConverter<ParkingPlace> {

    @Id
    @GeneratedValue(
            generator = "SEQ_PARKINGPLACE",
            strategy = GenerationType.SEQUENCE
    )
    private Long id;

    @Column(
            name = "PARKINGPLACE_NUMBER"
    )
    private int number;

    @ManyToOne()
    @JoinColumn(name = "PARKINGZONE_ID")
    private ParkingZoneEntity parkingZone ;


    @ManyToOne
    @JoinColumn(name = "car_id")
    private CarEntity car;



    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ParkingZoneEntity getParkingZone() {
        return parkingZone;
    }

    public void setParkingZone(ParkingZoneEntity parkingZone) {
        this.parkingZone = parkingZone;
    }

    public CarEntity getCar() {
        return car;
    }

    public void setCar(CarEntity car) {
        this.car = car;
    }



    @Override
    public void updateEntity(ParkingPlace dto) {
        setId(dto.getId());
        setNumber(dto.getNumber());
        setParkingZone(DtoEntityConverterUtils.convertToEntity(dto.getParkingZone(), ParkingZoneEntity.class));
        if (dto.getCar() != null) {
          setCar(DtoEntityConverterUtils.convertToEntity(dto.getCar(), CarEntity.class));
         }
        else {
            setCar(null);
        }


    }
    @Override
    public void updateDto(ParkingPlace dto) {
        dto.setId(getId());
        dto.setNumber(getNumber());
        dto.setParkingZone(DtoEntityConverterUtils.convertToDto(getParkingZone(), ParkingZone.class));
        dto.setCar(DtoEntityConverterUtils.convertToDto(getCar(), Car.class));
    }
}
