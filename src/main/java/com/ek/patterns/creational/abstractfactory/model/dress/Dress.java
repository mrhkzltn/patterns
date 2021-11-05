package com.ek.patterns.creational.abstractfactory.model.dress;

import com.ek.patterns.creational.abstractfactory.model.common.*;

public interface Dress {

    public Size getSize();
    public Color getColor();
    public Boolean inStock();
    public Bust getBust();
    public Waist getWaist();
    public Hip getHip();
}
