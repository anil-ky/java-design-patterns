package com.ay.patterns.behavioral.strategy.paymentcheckout.order;

import com.ay.patterns.behavioral.strategy.paymentcheckout.model.Product;
import com.ay.patterns.behavioral.strategy.paymentcheckout.strategies.PaymentStrategy;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Order class. Doesn't know the concrete payment method (strategy) user has
 * picked. It uses common strategy interface to delegate collecting payment data
 * to strategy object. It can be used to save order to database.
 */
public class Order {
    private List<Product> productList;
    private boolean isClosed = false;

    private PaymentStrategy strategy;

    public Order(List<Product> productList, PaymentStrategy strategy) {
        this.productList = productList;
        this.strategy = strategy;
    }

    public void pay() {
        strategy.collectPaymentDetails();
        Product product = productList.get(0);
        strategy.pay(product.getPrice() * product.getQuantity());
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}