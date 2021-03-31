package com.aor.refactoring.example3;

public class FixedDiscount implements Discount {
    private final int fixed;

    public FixedDiscount(int fixed) {
        this.fixed = fixed;
    }

    public double applyDiscount(double price) {
        double discountedPrice = price;

        discountedPrice = fixed > price ? 0 : price - fixed;

        return discountedPrice;
    }
}
