package com.tws.refactoring.extract_method;

import com.sun.org.apache.xpath.internal.operations.Or;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class OwingPrinterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void printOwing() {
//        System.out.print("hello");
//        assertEquals("hello", outContent.toString());
        //GIVEN
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1.0));
        orders.add(new Order(2.0));
        OwingPrinter owingPrinter = new OwingPrinter();
        //WHEN
        owingPrinter.printOwing("name",orders);
        //THEN
        assertEquals("*****************************\n" +
                "****** Customer totals ******\n" +
                "*****************************\n" +
                "name: name\n" +
                "amount: 3.0\n", outContent.toString());
    }

}