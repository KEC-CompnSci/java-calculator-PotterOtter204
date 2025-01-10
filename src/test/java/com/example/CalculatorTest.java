package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();
    
    @Test
    public void testAdd() {
        assertEquals(4, calculator.add(2, 2), "2 + 2 should equal 4");
    }
    
    @Test
    public void testSubtract() {
        assertEquals(2, calculator.subtract(4, 2), "4 - 2 should equal 2");
    }
}