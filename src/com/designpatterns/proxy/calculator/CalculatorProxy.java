package com.designpatterns.proxy.calculator;

public class CalculatorProxy implements ICalculator {
    private CalculatorManager calculatorManager;
    private int cachedVal = 0;

    @Override
    public int calculator() {
        if (calculatorManager == null) {
            calculatorManager = new CalculatorManager();
            cachedVal = calculatorManager.calculator();
        }
        return cachedVal;
    }
}
