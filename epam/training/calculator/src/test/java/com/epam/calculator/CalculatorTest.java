package com.epam.calculator;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class CalculatorTest {

    @Test
    public void testAddShouldAddWhenNumberRandom(){
        Calculator calculator = new Calculator();
        Random random = new Random();
        double firstArg= random.nextDouble();
        double secondArg= random.nextDouble();
        double sum=firstArg+secondArg;

        double result=calculator.add(firstArg,secondArg);

        Assert.assertEquals(sum,result,0.01);

        firstArg= random.nextDouble();
        secondArg= random.nextDouble();
        sum=firstArg+secondArg;

        result=calculator.add(firstArg,secondArg);

        Assert.assertEquals(sum,result,0.01);
    }
    @Test
    public void testSubtractShouldSubtractWhenNumberRandom(){
        Calculator calculator = new Calculator();
        Random random = new Random();
        double firstArg= random.nextDouble();
        double secondArg= random.nextDouble();
        double subtraction=firstArg-secondArg;

        double result=calculator.subtract(firstArg,secondArg);

        Assert.assertEquals(subtraction,result,0.01);

        firstArg= random.nextDouble();
        secondArg= random.nextDouble();
        subtraction=firstArg-secondArg;

        result=calculator.subtract(firstArg,secondArg);

        Assert.assertEquals(subtraction,result,0.01);
    }
    @Test
    public void testMultiplyShouldMultiplyWhenNumberRandom(){
        Calculator calculator = new Calculator();
        Random random = new Random();
        double firstArg= random.nextDouble();
        double secondArg= random.nextDouble();
        double multiplication=firstArg*secondArg;

        double result=calculator.multiply(firstArg,secondArg);

        Assert.assertEquals(multiplication,result,0.01);

        firstArg= random.nextDouble();
        secondArg= random.nextDouble();
        multiplication=firstArg*secondArg;

        result=calculator.multiply(firstArg,secondArg);

        Assert.assertEquals(multiplication,result,0.01);
    }
    @Test
    public void testDivideShouldDivideWhenNumberRandom(){
        Calculator calculator = new Calculator();
        Random random = new Random();
        double firstArg= random.nextDouble();
        double secondArg= random.nextDouble();
        double division=firstArg/secondArg;

        double result=calculator.divide(firstArg,secondArg);

        Assert.assertEquals(division,result,0.01);

        firstArg= random.nextDouble();
        secondArg= random.nextDouble();
        division=firstArg/secondArg;

        result=calculator.divide(firstArg,secondArg);

        Assert.assertEquals(division,result,0.01);
    }
}
