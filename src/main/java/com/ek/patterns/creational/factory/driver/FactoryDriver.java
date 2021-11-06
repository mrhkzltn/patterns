package com.ek.patterns.creational.factory.driver;

import com.ek.patterns.creational.factory.factory.DbType;
import com.ek.patterns.creational.factory.service.SampleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class FactoryDriver {

    private final SampleService service;

    public FactoryDriver(SampleService service) {
        this.service = service;
    }


    public void run() {
        log.info(service.createDb(DbType.ORACLE));
    }

}
