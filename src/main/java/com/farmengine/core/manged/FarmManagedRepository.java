package com.farmengine.core.manged;

import com.farmengine.DAO.FarmDao;
import com.farmengine.configuration.FarmEngineConfiguration;
import com.google.inject.Inject;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.lifecycle.Managed;
import io.dropwizard.setup.Environment;
import lombok.Getter;
import lombok.Setter;
import org.skife.jdbi.v2.DBI;

/**
 * Created by nisinha on 7/24/2016.
 */
@Getter @Setter
public class FarmManagedRepository implements Managed {

    private final FarmDao cropDao;
    @Inject
    public  FarmManagedRepository(FarmEngineConfiguration configuration, Environment environment) {
        final DBIFactory factory = new DBIFactory();
        final DBI jdbi = factory.build(environment, configuration.getDatabase(), "mysql");
        cropDao = jdbi.onDemand(FarmDao.class);
    }
    public void start() throws Exception {
        System.out.println("test me");
    }

    public void stop() throws Exception {

    }
}
