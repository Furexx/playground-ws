package de.bonprix.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCarEntity is a Querydsl query type for CarEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCarEntity extends EntityPathBase<CarEntity> {

    private static final long serialVersionUID = -2121070647L;

    public static final QCarEntity carEntity = new QCarEntity("carEntity");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath plateNumber = createString("plateNumber");

    public QCarEntity(String variable) {
        super(CarEntity.class, forVariable(variable));
    }

    public QCarEntity(Path<? extends CarEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCarEntity(PathMetadata metadata) {
        super(CarEntity.class, metadata);
    }

}

