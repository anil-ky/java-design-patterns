package com.ay.patterns.creational.builder;

public class BuilderLunchOrderBeanTest {

    public static void main(String[] args) {
        LunchOrder.LunchOrderBuilder builder = new LunchOrder.LunchOrderBuilder();
        builder.bread("Wheat")
                .condiments("Lettuce")
                .dressing("Mustard")
                .meat("Ham");

        LunchOrder lunchOrder = builder.build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());

    }
}
