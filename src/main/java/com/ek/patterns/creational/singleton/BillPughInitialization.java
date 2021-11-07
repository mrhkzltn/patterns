package com.ek.patterns.creational.singleton;

import lombok.extern.slf4j.Slf4j;

// most useful usage.
@Slf4j
public class BillPughInitialization {

    private BillPughInitialization() {
    }

    private static class SingletonHelper {
        private static final BillPughInitialization INSTANCE = new BillPughInitialization();
    }

    public static BillPughInitialization getInstance() {
        try {
            return SingletonHelper.INSTANCE;
        } catch (Exception e) {
            log.info("exception occured!");
            throw new RuntimeException(e);
        }
    }
}
