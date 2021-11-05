package com.ek.patterns.creational.abstractfactory.factory.creator;

import com.ek.patterns.creational.abstractfactory.model.skirt.CottonSkirt;
import com.ek.patterns.creational.abstractfactory.model.skirt.LinenSkirt;
import com.ek.patterns.creational.abstractfactory.model.skirt.PolyesterSkirt;
import com.ek.patterns.creational.abstractfactory.util.AttributeUtility;

public class SkirtCreator {
    public static LinenSkirt getLinenSkirt() {
        return new LinenSkirt(
                AttributeUtility.getSize(null, "S"),
                AttributeUtility.getColor("yellow", "ffd966", "hex"),
                Boolean.TRUE);
    }


    public static CottonSkirt getCottonSkirt() {
        return new CottonSkirt(
                AttributeUtility.getSize(null, "M"),
                AttributeUtility.getColor("white", "ffffff", "hex"),
                Boolean.TRUE);
    }


    public static PolyesterSkirt getPolyesterSkirt() {
        return new PolyesterSkirt(
                AttributeUtility.getSize(null, "L"),
                AttributeUtility.getColor("black", "000000", "hex"),
                Boolean.TRUE);
    }
}