package de.bonprix.model;

import de.bonprix.dto.Parking;
import de.bonprix.service.BasicTableDtoConverter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(
        name = "PARKING"
        )
@SequenceGenerator(
        name = "SEQ_PARKING",
        sequenceName = "SEQ_PARKING",
        allocationSize = 1 )
public class ParkingEntity implements BasicTableDtoConverter<Parking> {
    @Id
    @GeneratedValue(
            generator = "SEQ_PARKING",
            strategy = GenerationType.SEQUENCE
    )
    private Long id;

    @Column(
            name = "PARKING_NAME"
    )
    private String name;

    @Column(
            name = "PARKING_CITY"
    )
    private String city;

    @Column(
            name = "PARKING_STREET"
    )
    private String street;

    @Column(
            name = "ZIP_CODE"
    )
    private int zipCode;


    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public void updateEntity(Parking dto){
        setId(dto.getId());
        setName(dto.getName());
        setCity(dto.getCity());
        setStreet(dto.getStreet());
        setZipCode(dto.getZipCode());
    }

    @Override
    public void updateDto(Parking dto){
        dto.setId(getId());
        dto.setName(getName());
        dto.setCity(getCity());
        dto.setStreet(getStreet());
        dto.setZipCode(getZipCode());
    }
}
