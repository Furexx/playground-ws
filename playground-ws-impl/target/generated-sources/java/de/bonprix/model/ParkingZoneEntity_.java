package de.bonprix.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ParkingZoneEntity.class)
public abstract class ParkingZoneEntity_ {

	public static volatile SingularAttribute<ParkingZoneEntity, ParkingEntity> parking;
	public static volatile SingularAttribute<ParkingZoneEntity, String> name;
	public static volatile SingularAttribute<ParkingZoneEntity, Long> id;

	public static final String PARKING = "parking";
	public static final String NAME = "name";
	public static final String ID = "id";

}

