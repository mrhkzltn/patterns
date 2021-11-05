package com.ek.patterns.creational.abstractfactory.model.tshirt;

import com.ek.patterns.creational.abstractfactory.model.common.Color;
import com.ek.patterns.creational.abstractfactory.model.common.Size;

public interface TShirt {

    public Size getSize();
    public Color getColor();
    public Boolean getInStock();
}
