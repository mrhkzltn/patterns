package com.ek.patterns.creational.factory.db;

import com.ek.patterns.creational.factory.factory.DbType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
public class OracleDb implements  Db{

    public OracleDb() {
        this.initializeDb();
    }

    @Override
    public void initializeDb() {
        log.info("oracle db initialized");
    }

    @Override
    public String getDbType() {
        return DbType.ORACLE.name();
    }
}
