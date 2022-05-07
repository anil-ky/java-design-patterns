package com.ay.patterns.behavioral.strategy.addressvalidation;

public class SmartyStreetsStrategy implements AddressValidationStrategy {

    @Override
    public void execute() {
        System.out.println("SmartyStreets API");
    }
}
