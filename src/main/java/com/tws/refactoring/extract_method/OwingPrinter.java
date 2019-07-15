package com.tws.refactoring.extract_method;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class OwingPrinter {
    void printOwing(String name, List<Order> orders) {
        Iterator<Order> elements = orders.iterator();
        double outstanding = 0.0;
        printBanner();
        printDetails(name, getOutstanding(elements, outstanding));
    }

    private void printDetails(String name, double outstanding) {
        // print details
        System.out.print("name: " + name+"\n");
        System.out.print("amount: " + outstanding+"\n");
    }

    private double getOutstanding(Iterator<Order> elements, double outstanding) {
        // print owings
        while (elements.hasNext()) {
            Order each = (Order) elements.next();
            outstanding += each.getAmount();
        }
        return outstanding;
    }

    private void printBanner() {
        // print banner
        System.out.print ("*****************************\n");
        System.out.print ("****** Customer totals ******\n");
        System.out.print ("*****************************\n");
    }
}

class Order {
    private final double amount;

    public Order(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
