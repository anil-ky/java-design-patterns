package com.ay.patterns.behavioral.strategy.paymentcheckout.strategies;

/**
 * Payment interface for all strategies.
 */
public interface PaymentStrategy {
    boolean pay(double paymentAmount);

    void collectPaymentDetails();
}
