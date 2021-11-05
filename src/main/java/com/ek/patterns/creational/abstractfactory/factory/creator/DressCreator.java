package com.ek.patterns.creational.abstractfactory.factory.creator;


import com.ek.patterns.creational.abstractfactory.model.dress.CottonDress;
import com.ek.patterns.creational.abstractfactory.model.dress.LinenDress;
import com.ek.patterns.creational.abstractfactory.model.dress.PolyesterDress;
import com.ek.patterns.creational.abstractfactory.util.AttributeUtility;

public class DressCreator {
    public static LinenDress getLinenDress() {
        return new LinenDress(
                AttributeUtility.getSize(42, null),
                AttributeUtility.getColor("yellow", "ffd966", "hex"),
                Boolean.TRUE,
                AttributeUtility.getBust(32.4f),
                AttributeUtility.getWaist(34.5f),
                AttributeUtility.getHip(22.3f));
    }


    public static CottonDress getCottonDress() {
        return new CottonDress(
                AttributeUtility.getSize(38, null),
                AttributeUtility.getColor("white", "ffffff", "hex"),
                Boolean.TRUE,
                AttributeUtility.getBust(32.4f),
                AttributeUtility.getWaist(34.5f),
                AttributeUtility.getHip(22.3f));
    }

    public static PolyesterDress getPolyesterDress() {
        return new PolyesterDress(
                AttributeUtility.getSize(36, null),
                AttributeUtility.getColor("black", "000000", "hex"),
                Boolean.TRUE,
                AttributeUtility.getBust(32.4f),
                AttributeUtility.getWaist(34.5f),
                AttributeUtility.getHip(22.3f));
    }
}