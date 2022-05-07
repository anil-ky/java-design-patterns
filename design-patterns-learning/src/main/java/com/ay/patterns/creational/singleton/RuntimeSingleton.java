package com.ay.patterns.creational.singleton;

// Everyday Example
public class RuntimeSingleton {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        System.out.println(runtime);

        Runtime runtime2 = Runtime.getRuntime();
        runtime2.gc();
        System.out.println(runtime2);

        if (runtime == runtime2) {
            System.out.println("Both the instances are equal");
        }
    }
}
