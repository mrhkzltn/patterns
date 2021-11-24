package com.ek.patterns.creational.prototype.driver;

import com.ek.patterns.Driver;
import com.ek.patterns.creational.prototype.model.GameObject;
import com.ek.patterns.creational.prototype.model.GameObjectX;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class PrototypeDriver implements Driver {

    public static final String MASS = "3333";
    public static final String MASS2 = "4444";

    public void run() {
        GameObjectX gameObjectX = new GameObjectX("123", "321");
        gameObjectX.setMass(MASS);
        GameObjectX gameObjectXCopy = (GameObjectX) gameObjectX.copy();
        gameObjectXCopy.setMass(MASS2);
        if (gameObjectX.getMass().equalsIgnoreCase(MASS) &&
                gameObjectXCopy.getMass().equalsIgnoreCase(MASS2) &&
                gameObjectX.getPositionX().equalsIgnoreCase(gameObjectXCopy.getPositionX())
        ) {
            log.info("Clone succeed!");
        } else {
            log.info("Clone failed!");
        }

    }
}
