package com.ek.patterns.creational.abstractfactory.factory;

import com.ek.patterns.creational.abstractfactory.factory.creator.DressCreator;
import com.ek.patterns.creational.abstractfactory.factory.creator.SkirtCreator;
import com.ek.patterns.creational.abstractfactory.factory.creator.TShirtCreator;
import com.ek.patterns.creational.abstractfactory.model.dress.CottonDress;
import com.ek.patterns.creational.abstractfactory.model.dress.Dress;
import com.ek.patterns.creational.abstractfactory.model.dress.LinenDress;
import com.ek.patterns.creational.abstractfactory.model.dress.PolyesterDress;
import com.ek.patterns.creational.abstractfactory.model.skirt.CottonSkirt;
import com.ek.patterns.creational.abstractfactory.model.skirt.LinenSkirt;
import com.ek.patterns.creational.abstractfactory.model.skirt.PolyesterSkirt;
import com.ek.patterns.creational.abstractfactory.model.skirt.Skirt;
import com.ek.patterns.creational.abstractfactory.model.tshirt.CottonTshirt;
import com.ek.patterns.creational.abstractfactory.model.tshirt.LinenTShirt;
import com.ek.patterns.creational.abstractfactory.model.tshirt.PolyesterTShirt;
import com.ek.patterns.creational.abstractfactory.model.tshirt.TShirt;
import com.ek.patterns.creational.abstractfactory.common.ClothesMaterialType;
import com.ek.patterns.creational.abstractfactory.util.AttributeUtility;
import org.springframework.stereotype.Component;


public class PolyesterClothesFactory implements ClothesFactory {

    @Override
    public TShirt createTShirt() {
        return TShirtCreator.getPolyesterTShirt();

    }


    @Override
    public Dress createDress() {
        return DressCreator.getPolyesterDress();
    }

    @Override
    public Skirt createSkirt() {
        return SkirtCreator.getPolyesterSkirt();
    }







}
