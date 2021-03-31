package com.aor.refactoring.example1;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderLine> lines;

    public Order() {
        lines = new ArrayList<>();
    }

    public void add(Product product, int quantity) {
        lines.add(new OrderLine(product, quantity));
    }

    public double total() {
        double total = 0;
        for (OrderLine line : lines)
            total += line.getPrice();
        return total;
    }

    public boolean isElegibleForFreeDelivery() {
        if (this.total() > 100) return true;
        else return false;
    }

    public String printOrder() {
        StringBuilder printBuffer = new StringBuilder();

        for (OrderLine line : lines)
            printBuffer.append(line.getLine()).append("\n");

        printBuffer.append("Total: ").append(this.total());

        return printBuffer.toString();
    }
}