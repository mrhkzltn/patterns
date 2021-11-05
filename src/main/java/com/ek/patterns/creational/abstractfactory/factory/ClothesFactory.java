package com.ek.patterns.creational.abstractfactory.factory;

import com.ek.patterns.creational.abstractfactory.model.dress.Dress;
import com.ek.patterns.creational.abstractfactory.model.skirt.Skirt;
import com.ek.patterns.creational.abstractfactory.model.tshirt.TShirt;
import com.ek.patterns.creational.abstractfactory.common.ClothesMaterialType;

public interface ClothesFactory {
    public TShirt createTShirt();
    public Dress createDress();
    public Skirt createSkirt();

}
