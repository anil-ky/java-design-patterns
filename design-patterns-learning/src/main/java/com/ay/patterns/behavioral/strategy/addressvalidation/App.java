package com.ay.patterns.behavioral.strategy.addressvalidation;

public class App {
    public static void main(String[] args) {
        var addressValidation = new AddressValidation(new PreciselyStrategy());
        addressValidation.validateAddress();
        addressValidation.changeStrategy(new SmartyStreetsStrategy());
        addressValidation.validateAddress();
    }
}