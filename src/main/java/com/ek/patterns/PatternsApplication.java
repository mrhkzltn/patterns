package com.ek.patterns;

import com.ek.patterns.creational.abstractfactory.driver.AbstractFactoryDriver;
import com.ek.patterns.creational.builder.driver.BuilderPatternDriver;
import com.ek.patterns.creational.factory.driver.FactoryDriver;
import com.ek.patterns.creational.prototype.driver.PrototypeDriver;
import com.ek.patterns.structural.adapter.driver.AdapterDriver;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatternsApplication implements CommandLineRunner {

    private final FactoryDriver factoryDriver;
    private final AbstractFactoryDriver abstractFactoryDriver;
    private final BuilderPatternDriver builderPatternDriver;
    private final PrototypeDriver prototypeDriver;
    private final AdapterDriver adapterDriver;

    public PatternsApplication(FactoryDriver factoryDriver,
                               AbstractFactoryDriver abstractFactoryDriver,
                               BuilderPatternDriver builderPatternDriver,
                               PrototypeDriver prototypeDriver, AdapterDriver adapterDriver) {
        this.factoryDriver = factoryDriver;
        this.abstractFactoryDriver = abstractFactoryDriver;
        this.builderPatternDriver = builderPatternDriver;
        this.prototypeDriver = prototypeDriver;
        this.adapterDriver = adapterDriver;
    }

    public static void main(String[] args) {
        SpringApplication.run(PatternsApplication.class, args);
    }


    public void run(String... args) {
        this.builderPatternDriver.run();
        this.factoryDriver.run();
        this.abstractFactoryDriver.run();
        this.prototypeDriver.run();
        this.adapterDriver.run();
    }
}
