package com.bisaga.sakila.domain;

import com.bisaga.sakila.dbmodel.tables.records.ActorRecord;

import org.jooq.DSLContext;

import org.jooq.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;

import static com.bisaga.sakila.dbmodel.tables.Actor.ACTOR;

public class ActorService {
    private static final Logger LOG = LoggerFactory.getLogger(ActorService.class);

    private final DSLContext db;

    @Inject
    public ActorService(DSLContext db) {
        this.db = db;
    }

    public int insertActor(ActorRecord actor) {
        return actor.insert();
    }

    public int updateActor(ActorRecord actor) {
        return actor.update();
    }

    public void deleteActor(ActorRecord actor) {

        //actorDao.delete(actor);
    }

    public ActorRecord getActor(int id) {
        return db.selectFrom(ACTOR)
                .where(ACTOR.ACTOR_ID.eq(id))
                .fetchOne();
    }

    public Result<ActorRecord> findAllActors() {
        return db.selectFrom(ACTOR).fetch();
    }

}
