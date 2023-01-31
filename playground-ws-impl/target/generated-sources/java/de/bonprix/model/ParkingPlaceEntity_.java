package de.bonprix.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ParkingPlaceEntity.class)
public abstract class ParkingPlaceEntity_ {

	public static volatile SingularAttribute<ParkingPlaceEntity, Integer> number;
	public static volatile SingularAttribute<ParkingPlaceEntity, CarEntity> car;
	public static volatile SingularAttribute<ParkingPlaceEntity, ParkingZoneEntity> parkingZone;
	public static volatile SingularAttribute<ParkingPlaceEntity, Long> id;

	public static final String NUMBER = "number";
	public static final String CAR = "car";
	public static final String PARKING_ZONE = "parkingZone";
	public static final String ID = "id";

}

