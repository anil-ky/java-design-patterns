package com.ay.patterns.creational.builder;

public class LunchOrderBeanTest {

    public static void main(String[] args) {
        /*LunchOrderBean lunchOrderBean = new LunchOrderBean();
        lunchOrderBean.setBread("Wheat");
        lunchOrderBean.setCondiments("lettuce");
        lunchOrderBean.setDressing("Mustard");
        lunchOrderBean.setMeat("Ham");*/

        LunchOrderBean lunchOrderBean = new LunchOrderBean("Wheat", "Lettuce", "Mustard", "Ham");

        System.out.println(lunchOrderBean.getBread());
    }
}
