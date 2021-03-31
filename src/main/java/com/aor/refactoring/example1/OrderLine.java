package com.aor.refactoring.example1;

public class OrderLine {
    public Product product;
    public int quantity;

    public OrderLine(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getPrice() {
        return product.getPrice() * quantity;
    }

    public String getLine() {
        return product.getName()+"(x"+quantity+"): "+getPrice();
    }
}
