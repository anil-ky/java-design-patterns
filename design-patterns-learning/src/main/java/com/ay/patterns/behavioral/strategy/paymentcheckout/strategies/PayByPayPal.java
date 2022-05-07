package com.ay.patterns.behavioral.strategy.paymentcheckout.strategies;

/**
 * PayPal payment method.
 */
public class PayByPayPal implements PaymentStrategy {
    private boolean signedIn;

    /**
     * Collect customer's data.
     */
    @Override
    public void collectPaymentDetails() {
        if (verify()) {
            signedIn = true;
            System.out.println("Data verification has been successful.");
        } else {
            System.out.println("Wrong email or password!");
        }
    }

    private boolean verify() {
        return true;
    }

    /**
     * Save customer data for future shopping attempts.
     */
    @Override
    public boolean pay(double paymentAmount) {
        if (signedIn) {
            System.out.println("Paying " + paymentAmount + " using PayPal.");
            return true;
        } else {
            return false;
        }
    }

    private void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }
}

