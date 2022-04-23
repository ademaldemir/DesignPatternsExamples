package com.designpatterns.decorator.calculator;

/*
 * have to be abstract.
 */
public abstract class CalculatorDecorator implements Calculator {
    private Calculator calculator;

    public CalculatorDecorator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public double calculate() {
        return calculator.calculate();
    }
}
