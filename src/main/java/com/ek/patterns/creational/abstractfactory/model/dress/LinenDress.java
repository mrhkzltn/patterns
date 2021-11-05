package com.ek.patterns.creational.abstractfactory.model.dress;

import com.ek.patterns.creational.abstractfactory.model.common.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LinenDress implements Dress {
    private Size size;
    private Color color;
    private Boolean inStock;
    private Bust bust;
    private Waist waist;
    private Hip hip;


    @Override
    public Size getSize() {
        return this.size;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public Boolean inStock() {
        return this.inStock;
    }

    @Override
    public Bust getBust() {
        return this.bust;
    }

    @Override
    public Waist getWaist() {
        return this.waist;
    }

    @Override
    public Hip getHip() {
        return this.hip;
    }
}
