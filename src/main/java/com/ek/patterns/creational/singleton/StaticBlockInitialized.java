package com.ek.patterns.creational.singleton;

public class StaticBlockInitialized {

    private static StaticBlockInitialized instance;

    // static block initilization provides error handling, so it is more useful than eager initialization but not enough yet.
    // because it still initialized before calling getInstance.
    static {
        try {
            instance = new StaticBlockInitialized();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured!");
        }
    }

    private StaticBlockInitialized() {
    }

    public static StaticBlockInitialized getInstance() {
        return instance;
    }
}
