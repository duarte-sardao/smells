package com.aor.refactoring.example3;

public class PercentageDiscount implements Discount {
    private final double percentage;

    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    public double applyDiscount(double price) {
        double discountedPrice = price;

        discountedPrice = price - price * percentage;

        return discountedPrice;
    }
}
