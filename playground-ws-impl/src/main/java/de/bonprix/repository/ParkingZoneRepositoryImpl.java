package de.bonprix.repository;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQuery;
import de.bonprix.model.ParkingZoneEntity;
import de.bonprix.model.QParkingZoneEntity;
import de.bonprix.repository.jpa.ParkingZoneRepositoryCustom;
import de.bonprix.service.parkingzone.filter.ParkingZoneFilter;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.ws.rs.NotFoundException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ParkingZoneRepositoryImpl implements ParkingZoneRepositoryCustom {
    @Resource
    private EntityManager entityManager;



    @Override
    public ParkingZoneEntity findOne(ParkingZoneFilter filter) {
        final QParkingZoneEntity parkingZoneEntity = QParkingZoneEntity.parkingZoneEntity;
        final JPAQuery<ParkingZoneEntity> jpaQuery = createJpaQuery(parkingZoneEntity, filter);
        final BooleanBuilder builder = handleWhereClause(filter, parkingZoneEntity);
        final List<ParkingZoneEntity> parkingZones = jpaQuery.where(builder.getValue())
                .fetch()
                .stream()
                .distinct()
                .collect(Collectors.toList());
        if (parkingZones == null || parkingZones.isEmpty()) {
            throw new NotFoundException();
        }
        return parkingZones.get(0);
    }

    @Override
    public int count(ParkingZoneFilter filter) {
        final QParkingZoneEntity qParkingZoneEntity = QParkingZoneEntity.parkingZoneEntity;
        return Math.toIntExact(createJpaQuery(qParkingZoneEntity, filter).fetchCount());
    }

    private JPAQuery<ParkingZoneEntity> createJpaQuery(QParkingZoneEntity qParkingZone, ParkingZoneFilter parkingZoneFilter) {
        JPAQuery<ParkingZoneEntity> jpaQuery = getInitialQuery(qParkingZone);

        jpaQuery = jpaQuery.from(qParkingZone);
        return jpaQuery;
    }

    private JPAQuery<ParkingZoneEntity> getInitialQuery(final QParkingZoneEntity qParkingZone) {
        JPAQuery<ParkingZoneEntity> jpaQuery = new JPAQuery<>(this.entityManager);
        jpaQuery = jpaQuery.from(qParkingZone);
        return jpaQuery;
    }

    private BooleanBuilder handleWhereClause(ParkingZoneFilter filter, QParkingZoneEntity qParkingZone) {
        final  BooleanBuilder builder = new BooleanBuilder();
        if (filter != null && !filter.getParkingZoneIds().isEmpty()) {
            builder.and(qParkingZone.id.in(filter.getParkingZoneIds()));
        }
        return builder;
    }

    @Override
    public List<ParkingZoneEntity> findAll(ParkingZoneFilter filter) {
        if (filter == null) {
            return Collections.emptyList();
        }

        final QParkingZoneEntity parkingZoneEntity = QParkingZoneEntity.parkingZoneEntity;
        final JPAQuery<ParkingZoneEntity> jpaQuery = createJpaQuery(parkingZoneEntity, filter);
        final BooleanBuilder builder = handleWhereClause(filter, parkingZoneEntity);
        final List<ParkingZoneEntity> parkingZones = jpaQuery.offset(filter.getPage())
                // .where(builder.getValue())
                .limit(filter.getPageSize())
                .fetch()
                .stream()
                .distinct()
                .collect(Collectors.toList());

        if (parkingZones == null || parkingZones.isEmpty()) {
            throw new NotFoundException();
        }
        return parkingZones;
    }
}
