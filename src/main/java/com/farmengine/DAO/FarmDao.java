package com.farmengine.DAO;

import com.farmengine.model.TEst;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlBatch;
import org.skife.jdbi.v2.sqlobject.SqlQuery;

import java.util.List;

/**
 * Created by nisinha on 7/24/2016.
 */
public interface FarmDao {

    @SqlQuery("select * from cropdb where id = :id")
    String findNameById(@Bind("id") int id);

    @SqlBatch("insert into firstable (id, name) values (:id, :name)")
    public void insert(List<TEst> tEsts);

    void close();
}
