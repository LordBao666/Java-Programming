package com.lordbao.testing;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author Lord_Bao
 * @Date 2024/5/9 9:24
 * @Version 1.0
 */

public class CalculatorTest {

   @Test
    public void calculatorInitialValueZero() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.getValue());
    }

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        calculator.add(5);
        assertEquals(5,calculator.getValue());
    }

   @Test
    public void testSubtract() {
       Calculator calculator = new Calculator();
       calculator.subtract(5);
       assertEquals(-5,calculator.getValue());
    }
}