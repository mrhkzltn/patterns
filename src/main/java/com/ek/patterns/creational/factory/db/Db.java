package com.ek.patterns.creational.factory.db;

public interface Db {

    void initializeDb();

    String getDbType();
}
