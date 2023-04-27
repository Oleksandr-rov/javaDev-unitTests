package com.goit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
    public void iniSumCalculator (){
        sumCalculator = new SumCalculator();
    }

    @Test
    void testSum() {
        assertEquals(6, sumCalculator.sum(3), "Checking the number 3");
        assertEquals(55, sumCalculator.sum(10), "Checking the number 10");
    }

    @Test
    void testSumIllegalArgumentException () {
        assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));
    }
}