package com.ek.patterns.creational.factory.factory;

import com.ek.patterns.creational.factory.db.Db;

public abstract class BaseDbFactory {

    abstract Db getDb(DbType type);
}
