package com.bisaga.sakila.dagger;

import com.bisaga.sakila.dbmodel.tables.daos.ActorDao;
import com.bisaga.sakila.server.JooqConfigBuilder;
import com.bisaga.sakila.server.ConnectionBuilder;
import dagger.Module;
import dagger.Provides;
import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;

import javax.inject.Named;
import java.sql.Connection;

@Module
public class RequestModule {

    // Provides primary connection for the whole time request ran (loaded at the first component needs)
    @Provides
    @RequestScope
    public static Connection provideTransaction(ConnectionBuilder connectionBuilder) {
        return connectionBuilder.create(false);    // autoCommit=False, commit/rollback must be called manually
    }

    // Provides new connection on each call, by default those connections are short lived non-transactional (but it can change)
    @Provides
    @Named("connection")
    public static Connection provideConnection(ConnectionBuilder connectionBuilder) {
        return connectionBuilder.create(true);    // autoCommit=False, commit/rollback must be called manually
    }


    // Default configuration with transactions enabled, this is RequestScoped default database connection
    @Provides
    @RequestScope
    public static Configuration provideConfiguration(JooqConfigBuilder jooqConfigBuilder) {
        return jooqConfigBuilder.build();
    }

    // Default DSLContext with default configuration
    @Provides
    @RequestScope
    public static DSLContext provideDSLContext(Configuration configuration) {
        return DSL.using(configuration);
    }

    @Provides
    public static ActorDao provideActorDao(Configuration configuration){
        return new ActorDao(configuration);
    }

}
