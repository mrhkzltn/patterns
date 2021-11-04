package com.ek.patterns.creational.factory.db;

import com.ek.patterns.creational.factory.factory.DbType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
public class MysqlDb implements  Db{

    public MysqlDb() {
        this.initializeDb();
    }

    @Override
    public void initializeDb() {
        log.info("mysql db initialized");
    }

    @Override
    public String getDbType() {
        return DbType.MYSQL.name();
    }
}