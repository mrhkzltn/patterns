package com.ek.patterns.creational.abstractfactory.factory;

import com.ek.patterns.creational.abstractfactory.factory.creator.DressCreator;
import com.ek.patterns.creational.abstractfactory.factory.creator.SkirtCreator;
import com.ek.patterns.creational.abstractfactory.factory.creator.TShirtCreator;
import com.ek.patterns.creational.abstractfactory.model.dress.Dress;
import com.ek.patterns.creational.abstractfactory.model.skirt.Skirt;
import com.ek.patterns.creational.abstractfactory.model.tshirt.TShirt;
import com.ek.patterns.creational.abstractfactory.common.ClothesMaterialType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
public class CottonClothesFactory implements ClothesFactory {


    @Override
    public TShirt createTShirt() {
        log.info("CottonTshirt created!");
        return TShirtCreator.getCottonTshirt();
    }

    @Override
    public Dress createDress() {
        log.info("CottonDress created!");
        return DressCreator.getCottonDress();
    }

    @Override
    public Skirt createSkirt() {
        log.info("CottonSkirt created!");
        return SkirtCreator.getCottonSkirt();
    }
}
