package com.farmengine.module;

import com.farmengine.services.FarmDataService;
import com.farmengine.services.Impl.FarmDataServiceImpl;
import com.google.inject.AbstractModule;

/**
 * Created by nisinha on 7/24/2016.
 */
public class FarmEngineModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(FarmDataService.class).to(FarmDataServiceImpl.class);
    }
}
