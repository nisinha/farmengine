package com.farmengine.resource;

import com.farmengine.services.FarmDataService;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.farmengine.model.Saying;
import com.farmengine.services.FarmDataService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by nisinha on 7/24/2016.
 */
@Path("/cropdata")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
@Singleton
public class FarmEngineResource {

    private FarmDataService farmEngineService;

    @Inject
    public FarmEngineResource(FarmDataService cropEngineService) {
        this.farmEngineService = cropEngineService;
    }

    @GET
    @Path("/test")
    public Saying nd() {
        return new Saying("Alpha id", "test");
    }

    @POST
    @Path("/say")
    public Saying nd1(Saying saying) {
        saying.setContent("new Content");
        return saying;
    }
}
