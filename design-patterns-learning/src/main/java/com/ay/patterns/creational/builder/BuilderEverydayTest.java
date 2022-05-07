package com.ay.patterns.creational.builder;

public class BuilderEverydayTest {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        builder.append("customer properties --> ")
                .append("name, ")
                .append("address, ")
                .append("phone");

        System.out.println(builder.toString());
    }
}
