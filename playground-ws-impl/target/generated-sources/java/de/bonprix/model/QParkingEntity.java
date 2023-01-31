package de.bonprix.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QParkingEntity is a Querydsl query type for ParkingEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QParkingEntity extends EntityPathBase<ParkingEntity> {

    private static final long serialVersionUID = 1045690285L;

    public static final QParkingEntity parkingEntity = new QParkingEntity("parkingEntity");

    public final StringPath city = createString("city");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final StringPath street = createString("street");

    public final NumberPath<Integer> zipCode = createNumber("zipCode", Integer.class);

    public QParkingEntity(String variable) {
        super(ParkingEntity.class, forVariable(variable));
    }

    public QParkingEntity(Path<? extends ParkingEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QParkingEntity(PathMetadata metadata) {
        super(ParkingEntity.class, metadata);
    }

}

