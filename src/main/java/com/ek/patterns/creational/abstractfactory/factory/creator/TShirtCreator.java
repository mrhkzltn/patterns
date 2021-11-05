package com.ek.patterns.creational.abstractfactory.factory.creator;

import com.ek.patterns.creational.abstractfactory.model.tshirt.CottonTshirt;
import com.ek.patterns.creational.abstractfactory.model.tshirt.LinenTShirt;
import com.ek.patterns.creational.abstractfactory.model.tshirt.PolyesterTShirt;
import com.ek.patterns.creational.abstractfactory.util.AttributeUtility;

public  class TShirtCreator {
    public static LinenTShirt getLinenTShirt() {
        return new LinenTShirt(
                AttributeUtility.getSize(null, "S"),
                AttributeUtility.getColor("yellow", "ffd966", "hex"),
                Boolean.TRUE);
    }


    public static CottonTshirt getCottonTshirt() {
        return new CottonTshirt(
                AttributeUtility.getSize(null, "M"),
                AttributeUtility.getColor("white", "ffffff", "hex"),
                Boolean.TRUE);
    }


    public static PolyesterTShirt getPolyesterTShirt() {
        return new PolyesterTShirt(
                AttributeUtility.getSize(null, "L"),
                AttributeUtility.getColor("black", "000000", "hex"),
                Boolean.TRUE);
    }
}