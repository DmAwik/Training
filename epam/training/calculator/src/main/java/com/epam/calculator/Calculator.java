package com.epam.calculator;

public class Calculator {
    public double add(double firstArg, double secondArg){
        validationArguments(firstArg,secondArg);
        return firstArg+secondArg;
 }
    public double subtract(double firstArg, double secondArg){
        validationArguments(firstArg,secondArg);
        return firstArg-secondArg;
    }
    public double multiply(double firstArg, double secondArg){
        validationArguments(firstArg,secondArg);
        return firstArg*secondArg;
    }
    public double divide(double firstArg, double secondArg){
        validationArguments(firstArg,secondArg);
        validationDivisionByZero(secondArg);
        return firstArg/secondArg;
    }
    private void validationArguments(double firstArg, double secondArg){
     if (firstArg>Double.MAX_VALUE | secondArg>Double.MAX_VALUE | firstArg<-Double.MAX_VALUE | secondArg<-Double.MAX_VALUE) {
         throw new IllegalArgumentException("the argument is invalid");
     }
    }
    private void validationDivisionByZero(double secondArg){
     if (secondArg == 0){
         throw new IllegalArgumentException("Division by zero");
     }
    }
}
