package com.ay.patterns.creational.singleton;

public class DbSingletonTest {
    public static void main(String[] args) {
        DbSingleton dbSingleton = DbSingleton.getInstance();
        System.out.println(dbSingleton);

        DbSingleton dbSingleton2 = DbSingleton.getInstance();
        System.out.println(dbSingleton2);
    }
}
