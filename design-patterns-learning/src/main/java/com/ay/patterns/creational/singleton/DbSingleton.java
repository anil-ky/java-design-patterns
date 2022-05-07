package com.ay.patterns.creational.singleton;

public class DbSingleton {
    //private static DbSingleton dbSingleton = new DbSingleton(); eager loading
    private static volatile DbSingleton dbSingleton = null;
    private DbSingleton() {
        if (dbSingleton != null) {
            throw new RuntimeException("Use the getInstance() method to create");
        }
    }

    public static DbSingleton getInstance() {
        if (dbSingleton == null) {
            synchronized (DbSingleton.class) {
                if (dbSingleton == null) {
                    dbSingleton = new DbSingleton(); // lazy loading
                }
            }
        }

        return dbSingleton;
    }
}
