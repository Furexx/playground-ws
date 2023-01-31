package de.bonprix.repository;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQuery;
import de.bonprix.model.ParkingPlaceEntity;
import de.bonprix.model.QParkingPlaceEntity;
import de.bonprix.repository.jpa.ParkingPlaceRepositoryCustom;
import de.bonprix.service.parkingplace.filter.ParkingPlaceFilter;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ParkingPlaceRepositoryImpl implements ParkingPlaceRepositoryCustom {
    @Resource
    private EntityManager entityManager;

    @Override
    public List<ParkingPlaceEntity> findAll(ParkingPlaceFilter filter) {
        if (filter == null) {
            return Collections.emptyList();
        }

        final QParkingPlaceEntity parkingPlaceEntity = QParkingPlaceEntity.parkingPlaceEntity;
        final JPAQuery<ParkingPlaceEntity> jpaQuery = createJpaQuery(parkingPlaceEntity, filter);
        final BooleanBuilder builder = handleWhenClause(filter, parkingPlaceEntity);
        final List<ParkingPlaceEntity> parkingPlaces = jpaQuery.offset(filter.getPage())
                .where(builder.getValue())
                .limit(filter.getPageSize())
                .fetch()
                .stream()
                .distinct()
                .collect(Collectors.toList());
        return parkingPlaces;
    }

    @Override
    public ParkingPlaceEntity findOne(ParkingPlaceFilter filter) {
        final QParkingPlaceEntity qParkingPlaceEntity = QParkingPlaceEntity.parkingPlaceEntity;
        final JPAQuery<ParkingPlaceEntity> jpaQuery = createJpaQuery(qParkingPlaceEntity, filter);
        final BooleanBuilder builder = handleWhenClause(filter, qParkingPlaceEntity);
        final List<ParkingPlaceEntity> parkingPlaceEntities = jpaQuery.where(builder.getValue())
                .fetch()
                .stream()
                .distinct()
                .collect(Collectors.toList());
        if (parkingPlaceEntities.isEmpty()){
            return null;
        }else {
            return parkingPlaceEntities.get(0);
        }
    }


    @Override
    public int count(ParkingPlaceFilter filter) {
        final QParkingPlaceEntity qParkingPlaceEntity = QParkingPlaceEntity.parkingPlaceEntity;
        return Math.toIntExact(createJpaQuery(qParkingPlaceEntity, filter).fetchCount());
    }

    private JPAQuery<ParkingPlaceEntity> createJpaQuery(QParkingPlaceEntity qParkingPlaceEntity, ParkingPlaceFilter filter) {
        JPAQuery<ParkingPlaceEntity> jpaQuery = getInitialQuery(qParkingPlaceEntity);
        jpaQuery = jpaQuery.from(qParkingPlaceEntity);
        return jpaQuery;
    }


    private BooleanBuilder handleWhenClause(ParkingPlaceFilter filter, QParkingPlaceEntity qParkingPlaceEntity) {
        final BooleanBuilder builder = new BooleanBuilder();
        if (filter != null && !filter.getParkingPlaceIds().isEmpty()) {
            builder.and(qParkingPlaceEntity.id.in(filter.getParkingPlaceIds()));
        }
        return builder;
    }

    private JPAQuery<ParkingPlaceEntity> getInitialQuery(QParkingPlaceEntity qParkingPlaceEntity) {
        JPAQuery<ParkingPlaceEntity> jpaQuery = new JPAQuery<>(this.entityManager);
        jpaQuery = jpaQuery.from(qParkingPlaceEntity);
        return jpaQuery;
    }
}
