package com.designpatterns.proxy.calculator;

public class CalculatorManager implements ICalculator{
    @Override
    public int calculator() {
        int result = 2;

        for (int i = 1 ; i < 7 ; i++){
            result += result;
        }
        return result;
    }
}
