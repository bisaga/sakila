package com.bisaga.sakila.resource;

import com.bisaga.sakila.Application;
import com.bisaga.sakila.dagger.RequestComponent;
import com.bisaga.sakila.dagger.RequestScope;
import com.bisaga.sakila.dbmodel.tables.daos.ActorDao;
import com.bisaga.sakila.dbmodel.tables.pojos.Actor;
import com.bisaga.sakila.server.RequestSession;
import org.jooq.Configuration;
import org.jooq.SQLDialect;
import org.jooq.impl.DefaultConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spark.Request;
import spark.Response;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

@RequestScope
public class ActorResource {
    private static final Logger LOG = LoggerFactory.getLogger(ActorResource.class);
    private final UUID instanceId;

    private RequestSession requestSession;

    @Inject
    public ActorResource(RequestSession requestSession){
        instanceId = UUID.randomUUID();
        this.requestSession = requestSession;
    };

    public String getSessionId(Request request, Response response) {
        RequestComponent requestComponent = request.attribute("requestComponent");
        return instanceId.toString() + " ...... " +  requestComponent.requestSession().getSessionId();
    }

    public List<Actor> getActors(Request request, Response response)
    {
        List<Actor> actors = null;
        try {
            String cnUrl = "jdbc:postgresql://localhost:5432/sakila?user=postgres&password=postgres";
            Connection connection = DriverManager.getConnection(cnUrl);

            // Initialise an Configuration
            Configuration cfg = new DefaultConfiguration().set(connection).set(SQLDialect.POSTGRES_9_5);
            
            ActorDao dao = new ActorDao(cfg);
            actors = dao.findAll();
        }
        catch (SQLException ex) {
            LOG.error(ex.getMessage());
        }

        return actors;
    }
}
