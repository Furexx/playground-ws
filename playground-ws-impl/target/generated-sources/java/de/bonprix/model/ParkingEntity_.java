package de.bonprix.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ParkingEntity.class)
public abstract class ParkingEntity_ {

	public static volatile SingularAttribute<ParkingEntity, Integer> zipCode;
	public static volatile SingularAttribute<ParkingEntity, String> city;
	public static volatile SingularAttribute<ParkingEntity, String> street;
	public static volatile SingularAttribute<ParkingEntity, String> name;
	public static volatile SingularAttribute<ParkingEntity, Long> id;

	public static final String ZIP_CODE = "zipCode";
	public static final String CITY = "city";
	public static final String STREET = "street";
	public static final String NAME = "name";
	public static final String ID = "id";

}

