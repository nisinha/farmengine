package com.farmengine;

import com.farmengine.module.FarmEngineModule;
import com.farmengine.resource.FarmEngineResource;
import com.hubspot.dropwizard.guice.GuiceBundle;
import com.farmengine.configuration.FarmEngineConfiguration;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.eclipse.jetty.servlets.CrossOriginFilter;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;
import java.util.EnumSet;

/**
 * Created by nisinha on 7/24/2016.
 */
public class FarmEngineApplication extends Application<FarmEngineConfiguration> {
    private GuiceBundle<FarmEngineConfiguration> guiceBundle;

    @Override
    public void run(FarmEngineConfiguration configuration, Environment environment) throws Exception {
     /*   final FarmEngineResource resource = new FarmEngineResource(new FarmEngineService());
        environment.jersey().register(resource);

        FarmManagedRepository FarmManagedRepository = new FarmManagedRepository(configuration, environment);
        environment.lifecycle().manage(FarmManagedRepository);
      *//*  final DBIFactory factory = new DBIFactory();
        final DBI jdbi = factory.build(environment, config.getDatabase(), "postgresql");
        final UserDAO dao = jdbi.onDemand(UserDAO.class);
        environment.jersey().register(new UserResource(dao));*//*
*/

        final FilterRegistration.Dynamic cors =
                environment.servlets().addFilter("CORS", CrossOriginFilter.class);

        // Configure CORS parameters
        cors.setInitParameter("allowedOrigins", "*");
        cors.setInitParameter("allowedHeaders", "X-Requested-With,Content-Type,Accept,Origin");
        cors.setInitParameter("allowedMethods", "OPTIONS,GET,PUT,POST,DELETE,HEAD");

        // Add URL mapping
        cors.addMappingForUrlPatterns(EnumSet.allOf(DispatcherType.class), true, "/*");
        environment.jersey().register(FarmEngineResource.class);
    }

    @Override
    public void initialize(Bootstrap<FarmEngineConfiguration> bootstrap) {
        GuiceBundle<FarmEngineConfiguration> guiceBundle = GuiceBundle.<FarmEngineConfiguration>newBuilder()
                .addModule(new FarmEngineModule())
                .enableAutoConfig(getClass().getPackage().getName())
                .setConfigClass(FarmEngineConfiguration.class)
                .build();

        bootstrap.addBundle(guiceBundle);

        super.initialize(bootstrap);
    }

    public static void main(String[] args) throws Exception {
        new FarmEngineApplication().run(args);
    }
}
