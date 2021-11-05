package com.ek.patterns.creational.abstractfactory.util;

import com.ek.patterns.creational.abstractfactory.model.common.*;

public class AttributeUtility {

    public static Size getSize(Integer intSize, String strSize) {
        return new Size(intSize, strSize);
    }

    public static Color getColor(final String colorName, final String colorValue, final String colorType) {
        return new Color(colorName, colorValue, colorType);
    }

    public static Bust getBust(final Float bustValue) {
        return new Bust(bustValue);
    }

    public static Waist getWaist(final Float waist) {
        return new Waist(waist);
    }

    public static Hip getHip(final Float hipValue) {
        return new Hip(hipValue);
    }
}
