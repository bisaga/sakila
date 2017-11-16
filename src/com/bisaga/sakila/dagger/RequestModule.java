package com.bisaga.sakila.dagger;

import com.bisaga.sakila.dbmodel.tables.daos.ActorDao;
import com.bisaga.sakila.server.JooqConfigurationBuilder;
import com.bisaga.sakila.server.Transaction;
import com.bisaga.sakila.server.TransactionBuilder;
import dagger.Module;
import dagger.Provides;
import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;

import javax.inject.Named;

@Module
public class RequestModule {

    // Provides primary transaction/connection for the whole time request ran (loaded at the first component needs)
    // Because it is request scoped, it will be called only once, any other time the request scoped instance will return
    @Provides
    @RequestScope
    public static Transaction provideTransaction(TransactionBuilder transactionBuilder) {
        return transactionBuilder.create(false);    // default autoCommit=False, commit/rollback must be called manually
    }

    // TODO this is questionable. Research if is possible to use Provider<Transaction> or just call provideTransaction ?
    // Provides new instances (secondary) connections from the connection pool, this are used beside central request transaction
    @Provides
    @Named("create")
    public static Transaction createTransaction(TransactionBuilder transactionBuilder) {
        return transactionBuilder.create(true);    // default autoCommit=true, can be changed
    }


    // Default configuration with transactions enabled, this is RequestScoped default database connection
    @Provides
    @RequestScope
    public static Configuration provideConfiguration(JooqConfigurationBuilder jooqConfigurationBuilder) {
        return jooqConfigurationBuilder.build();
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
