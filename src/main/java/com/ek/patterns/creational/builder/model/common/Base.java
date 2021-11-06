package com.ek.patterns.creational.builder.model.common;

import lombok.Data;

@Data
public class Base {
    private String value;

    public Base(String value) {
        this.value = value;
    }
}
