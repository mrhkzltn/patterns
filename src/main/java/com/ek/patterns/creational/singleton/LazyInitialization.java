package com.ek.patterns.creational.singleton;

public class LazyInitialization {
    private static LazyInitialization instance;

    private LazyInitialization() {
    }

    // this will work fine for single threaded systems. But for multithreaded system;
    // two different thread can get 2 different instance. it will destroy singleton pattern.
    public static LazyInitialization getInstance(){

        if(instance == null){
            return new LazyInitialization();
        }
        return instance;
    }
}
