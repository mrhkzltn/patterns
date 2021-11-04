package com.ek.patterns.creational.factory.service;

import com.ek.patterns.creational.factory.db.Db;
import com.ek.patterns.creational.factory.factory.DbFactory;
import com.ek.patterns.creational.factory.factory.DbType;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

    private final DbFactory dbFactory;

    public SampleService(DbFactory dbFactory) {
        this.dbFactory = dbFactory;
    }

    public String createDb(DbType type){
        Db db = dbFactory.getDb(type);
        return db.getDbType();
    }
}
