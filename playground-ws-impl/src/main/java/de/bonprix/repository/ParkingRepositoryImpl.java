package de.bonprix.repository;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQuery;
import de.bonprix.model.ParkingEntity;
import de.bonprix.model.QParkingEntity;
import de.bonprix.repository.jpa.ParkingRepositoryCustom;
import de.bonprix.service.parking.filter.ParkingFilter;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.ws.rs.NotFoundException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class ParkingRepositoryImpl implements ParkingRepositoryCustom {
    @Resource
    private EntityManager entityManager;

    private JPAQuery<ParkingEntity> createJpaQuery(QParkingEntity qParkingEntity, ParkingFilter filter){
        JPAQuery<ParkingEntity> jpaQuery = getInitialQuery(qParkingEntity);

        final BooleanBuilder builder = handleWhereClause(filter, qParkingEntity);

        jpaQuery = jpaQuery.where(builder);

        return jpaQuery;
    }

    private JPAQuery<ParkingEntity> getInitialQuery(final QParkingEntity qParkingEntity) {
        JPAQuery<ParkingEntity> jpaQuery = new JPAQuery<>(this.entityManager);
        jpaQuery = jpaQuery.from(qParkingEntity);
        return jpaQuery;
    }

    private BooleanBuilder handleWhereClause(ParkingFilter filter, QParkingEntity qParking) {
        final BooleanBuilder builder = new BooleanBuilder();
        if (filter != null && !filter.getParkingIds().isEmpty()) {
            builder.and(qParking.id.in(filter.getParkingIds()));
        }
        return builder;
    }

    @Override
    public List<ParkingEntity> findAll(ParkingFilter filter) {
        if (filter == null){
            return Collections.emptyList();
        }
        final QParkingEntity parkingEntity = QParkingEntity.parkingEntity;
        final JPAQuery<ParkingEntity> jpaQuery = createJpaQuery(parkingEntity, filter);
        final List<ParkingEntity> parkingEntities = jpaQuery.offset(filter.getPage())
                .limit(filter.getPageSize())
                .fetch()
                .stream()
                .distinct()
                .collect(Collectors.toList());

        if (parkingEntities == null || parkingEntities.isEmpty()) {
            throw new NotFoundException();
        }
        return parkingEntities;

    }

    @Override
    public ParkingEntity findOne(ParkingFilter filter) {
        final QParkingEntity parkingEntity = QParkingEntity.parkingEntity;
        final JPAQuery<ParkingEntity> jpaQuery = createJpaQuery(parkingEntity, filter);
        final List<ParkingEntity> parkingEntities = jpaQuery.fetch()
                .stream()
                .distinct()
                .collect(Collectors.toList());
        if (parkingEntities == null || parkingEntities.isEmpty()) {
            throw new NotFoundException();
        }
        return parkingEntities.get(0);
    }

    @Override
    public int count(ParkingFilter filter) {
        final QParkingEntity parkingEntity = QParkingEntity.parkingEntity;
        return Math.toIntExact(createJpaQuery(parkingEntity, filter).fetchCount());
    }
}
