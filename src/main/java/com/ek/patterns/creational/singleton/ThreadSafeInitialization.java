package com.ek.patterns.creational.singleton;

public class ThreadSafeInitialization {

    private static ThreadSafeInitialization instance;

    private ThreadSafeInitialization() {
    }

    public static ThreadSafeInitialization getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeInitialization.class) {
                if (instance == null) {
                    return new ThreadSafeInitialization();
                }
            }

        }
        return instance;
    }
}
