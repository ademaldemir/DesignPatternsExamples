package com.designpatterns.proxy.calculator;

public class Program {
    public static void main(String[] args) {
        ICalculator calculator = new CalculatorProxy();
        System.out.println(calculator.calculator());
        System.out.println(calculator.calculator());
    }
}
