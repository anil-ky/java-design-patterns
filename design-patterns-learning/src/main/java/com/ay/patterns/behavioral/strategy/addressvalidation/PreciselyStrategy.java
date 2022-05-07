package com.ay.patterns.behavioral.strategy.addressvalidation;

public class PreciselyStrategy implements AddressValidationStrategy {

    @Override
    public void execute() {
        System.out.println("Precisely API");
    }
}
