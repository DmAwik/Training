package com.epam.calculator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import java.util.Random;

public class Calculators {
    @Test
public void testAdd(){
        Random random = new Random();
        double firstArg= random.nextDouble();
        double secondArg= random.nextDouble();
        double result=firstArg+secondArg;
        Calculator calculator = new Calculator();

        Assert.assertEquals(result,calculator.add(firstArg,secondArg),0.01);

        firstArg= random.nextDouble();
        secondArg= random.nextDouble();
        result=firstArg+secondArg;

        Assert.assertEquals(result,calculator.add(firstArg,secondArg),0.01);
    }
    @Test
    public void testSubtract(){
        Random random = new Random();
        double firstArg= random.nextDouble();
        double secondArg= random.nextDouble();
        double result=firstArg-secondArg;
        Calculator calculator = new Calculator();

        Assert.assertEquals(result,calculator.subtract(firstArg,secondArg),0.01);

        firstArg= random.nextDouble();
        secondArg= random.nextDouble();
        result=firstArg-secondArg;

        Assert.assertEquals(result,calculator.subtract(firstArg,secondArg),0.01);
    }
    @Test
    public void testMultiply(){
        Random random = new Random();
        double firstArg= random.nextDouble();
        double secondArg= random.nextDouble();
        double result=firstArg*secondArg;
        Calculator calculator = new Calculator();

        Assert.assertEquals(result,calculator.multiply(firstArg,secondArg),0.01);

        firstArg= random.nextDouble();
        secondArg= random.nextDouble();
        result=firstArg*secondArg;

        Assert.assertEquals(result,calculator.multiply(firstArg,secondArg),0.01);
    }
    @Test
    public void testDivide(){
        Random random = new Random();
        double firstArg= random.nextDouble();
        double secondArg= random.nextDouble();
        double result=firstArg/secondArg;
        Calculator calculator = new Calculator();

        Assert.assertEquals(result,calculator.divide(firstArg,secondArg),0.01);

        firstArg= random.nextDouble();
        secondArg= random.nextDouble();
        result=firstArg/secondArg;

        Assert.assertEquals(result,calculator.divide(firstArg,secondArg),0.01);
    }
}
