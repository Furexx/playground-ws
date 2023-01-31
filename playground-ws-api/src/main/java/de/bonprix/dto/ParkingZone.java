package de.bonprix.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class ParkingZone extends Entity{
    private static final long serialVersionUID = 1L;

    private String name;
    private Parking parking;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parking getParking() {
        return parking;
    }

    public void setParking(Parking parking) {
        this.parking = parking;
    }
}
