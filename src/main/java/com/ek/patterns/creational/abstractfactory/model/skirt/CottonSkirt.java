package com.ek.patterns.creational.abstractfactory.model.skirt;

import com.ek.patterns.creational.abstractfactory.model.common.Color;
import com.ek.patterns.creational.abstractfactory.model.common.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CottonSkirt implements Skirt {

    private Size size;
    private Color color;
    private Boolean inStock;

    @Override
    public Size getSize() {
        return this.size;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public Boolean getInStock() {
        return this.inStock;
    }
}
