package com.designpatterns.decorator.calculator;

/*
Concrete Component class : Decorator will process on this class. It will use it with composition structure.
 */
public class ConcreteCalculator implements Calculator{
    private double value=0;

    public ConcreteCalculator(double value) {
        this.value = value;
    }

    @Override
    public double calculate() {
        return value;
    }
}
