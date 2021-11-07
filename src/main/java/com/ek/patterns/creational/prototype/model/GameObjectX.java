package com.ek.patterns.creational.prototype.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

public class GameObjectX extends GameObject{

    private String positionX;
    private String positionY;
    private String mass;

    public GameObjectX(String positionX, String positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    @Override
    public GameObject copy() {
        GameObjectX gameObjectX = new GameObjectX(this.getPositionX(),this.positionY);
        gameObjectX.setMass("123");
        return gameObjectX;
    }
}
