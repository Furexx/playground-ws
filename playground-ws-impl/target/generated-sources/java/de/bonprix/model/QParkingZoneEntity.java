package de.bonprix.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QParkingZoneEntity is a Querydsl query type for ParkingZoneEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QParkingZoneEntity extends EntityPathBase<ParkingZoneEntity> {

    private static final long serialVersionUID = -1982291591L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QParkingZoneEntity parkingZoneEntity = new QParkingZoneEntity("parkingZoneEntity");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final QParkingEntity parking;

    public QParkingZoneEntity(String variable) {
        this(ParkingZoneEntity.class, forVariable(variable), INITS);
    }

    public QParkingZoneEntity(Path<? extends ParkingZoneEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QParkingZoneEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QParkingZoneEntity(PathMetadata metadata, PathInits inits) {
        this(ParkingZoneEntity.class, metadata, inits);
    }

    public QParkingZoneEntity(Class<? extends ParkingZoneEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.parking = inits.isInitialized("parking") ? new QParkingEntity(forProperty("parking")) : null;
    }

}

