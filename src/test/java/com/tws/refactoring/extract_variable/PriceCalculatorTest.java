package com.tws.refactoring.extract_variable;

import org.junit.Test;

import static org.junit.Assert.*;

public class PriceCalculatorTest {

    @Test
    public void should_return_2point2_when_quantity_is_1_and_itemPrice_is_2(){
        //GIVEN
        PriceCalculator priceCalculator = new PriceCalculator();
        //WHEN
        double price = priceCalculator.getPrice(1, 2);
        //THEN
        assertEquals(2.2,price, 1.0);
    }
}
