package com.epam.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddShouldAddWhenNumbersPositive(){
        Calculator calculator = new Calculator();

        double result=calculator.add(8.17d,11.2d);

        Assert.assertEquals(19.37d,result,0.01);
    }
    @Test
    public void testAddShouldAddWhenNumbersNegative(){
        Calculator calculator = new Calculator();

        double result=calculator.add(-8.17d,-11.2d);

        Assert.assertEquals(-19.37d,result,0.01);
    }
    @Test
    public void testSubtractShouldSubtractWhenNumbersPositive(){
        Calculator calculator = new Calculator();

        double result=calculator.subtract(5.43d,7.56d);

        Assert.assertEquals(-2.13d,result,0.01);
    }
    @Test
    public void testSubtractShouldSubtractWhenNumbersNegative(){
        Calculator calculator = new Calculator();

        double result=calculator.subtract(-5.43d,-7.56d);

        Assert.assertEquals(2.13d,result,0.01);
    }

    @Test
    public void testMultiplyShouldMultiplyWhenNumbersPositive(){
        Calculator calculator = new Calculator();

        double result=calculator.multiply(2.5d,2.5d);

        Assert.assertEquals(6.25d,result,0.01);
    }
    @Test
    public void testMultiplyShouldMultiplyWhenOneNumberPositiveOneNegative(){
        Calculator calculator = new Calculator();

        double result=calculator.multiply(2.5d,-2.5d);

        Assert.assertEquals(-6.25d,result,0.01);
    }
    @Test
    public void testDivideShouldDivideWhenNumbersPositive(){
        Calculator calculator = new Calculator();

        double result=calculator.divide(42.2d,2d);

        Assert.assertEquals(21.1d,result,0.01);
    }
    @Test
    public void testDivideShouldDivideWhenOneNumberPositiveOneNumberNegative(){
        Calculator calculator = new Calculator();

        double result=calculator.divide(42.2d,-2d);

        Assert.assertEquals(-21.1d,result,0.01);
    }
}
