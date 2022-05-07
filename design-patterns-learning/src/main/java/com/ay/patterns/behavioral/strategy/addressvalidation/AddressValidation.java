package com.ay.patterns.behavioral.strategy.addressvalidation;

public class AddressValidation {
    private AddressValidationStrategy strategy;

    public AddressValidation(AddressValidationStrategy strategy) {
        this.strategy = strategy;
    }

    public void changeStrategy(AddressValidationStrategy strategy) {
        this.strategy = strategy;
    }

    public void validateAddress() {
        strategy.execute();
    }
}
