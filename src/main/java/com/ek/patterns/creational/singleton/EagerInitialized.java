package com.ek.patterns.creational.singleton;

/*
- use that if class is not using a lot of resource.
- singleton classes are created for resources such as file or db.
- this is not useful because not provide error handling.
 */

public class EagerInitialized {

    private final static EagerInitialized eagerInitialized = new EagerInitialized();

    private EagerInitialized() {
    }

    public static EagerInitialized getInstance() {
        return eagerInitialized;
    }
}
