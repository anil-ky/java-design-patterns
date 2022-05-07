package com.ay.patterns.behavioral.strategy.paymentcheckout;

import com.ay.patterns.behavioral.strategy.paymentcheckout.model.Product;
import com.ay.patterns.behavioral.strategy.paymentcheckout.order.Order;
import com.ay.patterns.behavioral.strategy.paymentcheckout.strategies.PayByPayPal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Payment application class
 */
public class Demo {

    public static void main(String[] args) throws IOException {
        // payment for iPhone using PayPal
        Product iPhone = new Product("iPhone 12", 60000, 1);
        Product twsEarPhones = new Product("Nothing", 6000, 1);

        List<Product> productList = new ArrayList<>();
        productList.add(iPhone);

        Order order = new Order(productList, new PayByPayPal());
        order.pay();
    }
}