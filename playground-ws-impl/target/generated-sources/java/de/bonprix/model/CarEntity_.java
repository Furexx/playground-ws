package de.bonprix.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CarEntity.class)
public abstract class CarEntity_ {

	public static volatile SingularAttribute<CarEntity, Long> id;
	public static volatile SingularAttribute<CarEntity, String> plateNumber;

	public static final String ID = "id";
	public static final String PLATE_NUMBER = "plateNumber";

}

