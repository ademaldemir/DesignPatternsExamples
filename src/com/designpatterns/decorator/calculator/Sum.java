package com.designpatterns.decorator.calculator;

public class Sum extends CalculatorDecorator{
    private double value;

    public Sum(Calculator calculator, double value) {
        super(calculator);
        this.value = value;
    }

    @Override
    public double calculate() {
        return super.calculate() + value;
    }
}
