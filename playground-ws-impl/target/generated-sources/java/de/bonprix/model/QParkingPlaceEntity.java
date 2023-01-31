package de.bonprix.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QParkingPlaceEntity is a Querydsl query type for ParkingPlaceEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QParkingPlaceEntity extends EntityPathBase<ParkingPlaceEntity> {

    private static final long serialVersionUID = 45433408L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QParkingPlaceEntity parkingPlaceEntity = new QParkingPlaceEntity("parkingPlaceEntity");

    public final QCarEntity car;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> number = createNumber("number", Integer.class);

    public final QParkingZoneEntity parkingZone;

    public QParkingPlaceEntity(String variable) {
        this(ParkingPlaceEntity.class, forVariable(variable), INITS);
    }

    public QParkingPlaceEntity(Path<? extends ParkingPlaceEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QParkingPlaceEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QParkingPlaceEntity(PathMetadata metadata, PathInits inits) {
        this(ParkingPlaceEntity.class, metadata, inits);
    }

    public QParkingPlaceEntity(Class<? extends ParkingPlaceEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.car = inits.isInitialized("car") ? new QCarEntity(forProperty("car")) : null;
        this.parkingZone = inits.isInitialized("parkingZone") ? new QParkingZoneEntity(forProperty("parkingZone"), inits.get("parkingZone")) : null;
    }

}

