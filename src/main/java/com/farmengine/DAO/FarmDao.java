package com.farmengine.DAO;

import com.farmengine.model.Request.FarmLocation;
import com.farmengine.model.TEst;
import org.skife.jdbi.v2.sqlobject.*;

import java.util.List;

/**
 * Created by nisinha on 7/24/2016.
 */
public interface FarmDao {

    @SqlQuery("select * from cropdb where id = :id")
    String findNameById(@Bind("id") int id);

    @SqlUpdate("insert into farmlocation(farmId, farmName, customerId, latitude, longitude, radius) values (:farmId, :farmName, :customerId, :latitude, :longitude, :radius)")
    public void insertFarmLocation(@BindBean FarmLocation location);

    void close();
}
