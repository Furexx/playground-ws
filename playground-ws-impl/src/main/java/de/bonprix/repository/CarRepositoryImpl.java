package de.bonprix.repository;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQuery;
import de.bonprix.model.CarEntity;
import de.bonprix.model.QCarEntity;
import de.bonprix.repository.jpa.CarRepositoryCustom;
import de.bonprix.service.car.filter.CarFilter;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.ws.rs.NotFoundException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarRepositoryImpl implements CarRepositoryCustom {
    @Resource
    private EntityManager entityManager;

    @Override
    public List<CarEntity> findAll(CarFilter filter) {
        if (filter == null){
            return Collections.emptyList();
        }

        final QCarEntity carEntity = QCarEntity.carEntity;
        final JPAQuery<CarEntity> jpaQuery = createJpaQuery(carEntity, filter);
        final BooleanBuilder builder = handleWhereClause(filter, carEntity);
        final List<CarEntity> cars = jpaQuery.offset(filter.getPage())
                .limit(filter.getPageSize())
                .fetch()
                .stream()
                .distinct()
                .collect(Collectors.toList());

        return cars;
    }

    @Override
    public CarEntity findOne(CarFilter filter) {
        final QCarEntity carEntity = QCarEntity.carEntity;
        final JPAQuery<CarEntity> jpaQuery = createJpaQuery(carEntity, filter);
        final BooleanBuilder builder = handleWhereClause(filter, carEntity);
        final List<CarEntity> cars = jpaQuery.where(builder.getValue())
                .fetch()
                .stream()
                .distinct()
                .collect(Collectors.toList());
        if (cars == null || cars.isEmpty()) {
            throw new NotFoundException();
        }
        return cars.get(0);
    }

    @Override
    public int count(CarFilter filter) {
        final QCarEntity qCarEntity = QCarEntity.carEntity;
        return Math.toIntExact(createJpaQuery(qCarEntity, filter).fetchCount());
    }

    private JPAQuery<CarEntity> createJpaQuery(QCarEntity qCarEntity, CarFilter filter) {
        JPAQuery<CarEntity> jpaQuery = getInitialQuery(qCarEntity);
        jpaQuery = jpaQuery.from(qCarEntity);

        return jpaQuery;
    }

    private BooleanBuilder handleWhereClause(CarFilter filter, QCarEntity qCarEntity) {
        final BooleanBuilder builder = new BooleanBuilder();
        if (filter != null && !filter.getCarIds().isEmpty()) {
            builder.and(qCarEntity.id.in(filter.getCarIds()));
        }

        return builder;
    }

    private JPAQuery<CarEntity> getInitialQuery(QCarEntity qCarEntity) {
     JPAQuery<CarEntity> jpaQuery = new JPAQuery<>(this.entityManager);
     jpaQuery = jpaQuery.from(qCarEntity);
     return jpaQuery;
    }
}
