package com.ek.patterns.creational.abstractfactory.driver;

import com.ek.patterns.Driver;
import com.ek.patterns.creational.abstractfactory.common.ClothesMaterialType;
import com.ek.patterns.creational.abstractfactory.factory.ClothesFactory;
import com.ek.patterns.creational.abstractfactory.factory.producer.FactoryProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AbstractFactoryDriver implements Driver {

    private final FactoryProducer factoryProducer;

    public AbstractFactoryDriver(FactoryProducer factoryProducer) {
        this.factoryProducer = factoryProducer;
    }


    public void run() {

        ClothesFactory clothesFactory = factoryProducer.getClothesFactory(ClothesMaterialType.COTTON);
        log.info("factory clothes: {}", clothesFactory.createDress());

    }
}
