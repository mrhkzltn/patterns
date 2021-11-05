package com.ek.patterns.creational.abstractfactory.factory;

import com.ek.patterns.creational.abstractfactory.factory.creator.DressCreator;
import com.ek.patterns.creational.abstractfactory.factory.creator.SkirtCreator;
import com.ek.patterns.creational.abstractfactory.factory.creator.TShirtCreator;
import com.ek.patterns.creational.abstractfactory.model.dress.Dress;
import com.ek.patterns.creational.abstractfactory.model.skirt.Skirt;
import com.ek.patterns.creational.abstractfactory.model.tshirt.TShirt;
import com.ek.patterns.creational.abstractfactory.common.ClothesMaterialType;
import org.springframework.stereotype.Component;


public class LinenClothesFactory implements ClothesFactory {

    @Override
    public TShirt createTShirt() {
        return TShirtCreator.getLinenTShirt();
    }

    @Override
    public Dress createDress() {
        return DressCreator.getLinenDress();
    }

    @Override
    public Skirt createSkirt() {
        return SkirtCreator.getLinenSkirt();
    }
}
