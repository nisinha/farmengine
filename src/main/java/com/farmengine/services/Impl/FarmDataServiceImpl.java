package com.farmengine.services.Impl;

import com.farmengine.DAO.FarmDao;
import com.farmengine.model.Request.FarmLocation;
import com.farmengine.services.FarmDataService;

/**
 * Created by nisinha on 7/24/2016.
 */
public class FarmDataServiceImpl implements FarmDataService {

    private FarmDao farmDao;

    public FarmDataServiceImpl(FarmDao farmDao) {
        this.farmDao = farmDao;
    }
    public void addFarmData(FarmLocation farmLocation) {
        farmDao.insertFarmLocation(farmLocation);
    }

}
