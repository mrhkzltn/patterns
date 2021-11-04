package com.ek.patterns.creational.factory.driver;

import com.ek.patterns.creational.factory.factory.DbType;
import com.ek.patterns.creational.factory.service.SampleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class FactoryDriver implements CommandLineRunner {

    private final SampleService service;

    public FactoryDriver(SampleService service) {
        this.service = service;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info(this.service.createDb(DbType.ORACLE));
    }

}
