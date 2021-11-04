package com.ek.patterns.creational.factory.factory;

import com.ek.patterns.creational.factory.db.Db;
import com.ek.patterns.creational.factory.db.MysqlDb;
import com.ek.patterns.creational.factory.db.OracleDb;
import org.springframework.stereotype.Component;

@Component
public class DbFactory extends BaseDbFactory {



    @Override
    public Db getDb(DbType type) {
        switch (type){
            case MYSQL:
                return new MysqlDb();
            case ORACLE:
                return new OracleDb();
            default:
                return null;

        }
    }
}
