package com.designpatterns.decorator.calculator;

public class Multiply extends CalculatorDecorator{
    private double value;
    public Multiply(Calculator calculator, double value) {
        super(calculator);
        this.value = value;
    }

    @Override
    public double calculate() {
        return super.calculate() * value;
    }
}
