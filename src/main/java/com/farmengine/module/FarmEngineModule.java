package com.farmengine.module;

import com.farmengine.core.manged.FarmManagedRepository;
import com.farmengine.services.FarmDataService;
import com.farmengine.services.Impl.FarmDataServiceImpl;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;

/**
 * Created by nisinha on 7/24/2016.
 */
public class FarmEngineModule extends AbstractModule {
    @Override
    protected void configure() {
    }

    @Provides
    public FarmDataService provideFarmDataService(FarmManagedRepository repository) {
        return new FarmDataServiceImpl(repository.getCropDao());
    }
}
