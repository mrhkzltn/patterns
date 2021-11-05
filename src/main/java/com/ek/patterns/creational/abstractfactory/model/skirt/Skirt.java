package com.ek.patterns.creational.abstractfactory.model.skirt;

import com.ek.patterns.creational.abstractfactory.model.common.Color;
import com.ek.patterns.creational.abstractfactory.model.common.Size;

public interface Skirt {
    public Size getSize();
    public Color getColor();
    public Boolean getInStock();
}
