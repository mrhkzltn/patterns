package com.ek.patterns.creational.prototype.model;

import lombok.Data;

@Data
public class GameObjectY extends GameObject{

    private String positionX;
    private String positionY;
    private String mass;

    public GameObjectY(String positionX, String positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    @Override
    public GameObject copy() {
        GameObjectY gameObjectY = new GameObjectY(this.getPositionX(),this.getPositionY());
        gameObjectY.setMass("321");
        return gameObjectY;
    }
}
