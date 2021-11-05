package com.ek.patterns.creational.abstractfactory.factory.producer;

import com.ek.patterns.creational.abstractfactory.factory.ClothesFactory;
import com.ek.patterns.creational.abstractfactory.factory.CottonClothesFactory;
import com.ek.patterns.creational.abstractfactory.factory.LinenClothesFactory;
import com.ek.patterns.creational.abstractfactory.factory.PolyesterClothesFactory;
import com.ek.patterns.creational.abstractfactory.common.ClothesMaterialType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class FactoryProducer {

    public ClothesFactory getClothesFactory(ClothesMaterialType materialType) {

        switch (materialType) {
            case LINEN:
                log.info("LinenClothesFactory is created!");
                return new LinenClothesFactory();
            case COTTON:
                log.info("CotttonClothesFactory is created!");
                return new CottonClothesFactory();
            case POLYESTER:
                log.info("PolyesterClothesFactory is created!");
                return new PolyesterClothesFactory();
            default:
                return null;
        }

    }
}
