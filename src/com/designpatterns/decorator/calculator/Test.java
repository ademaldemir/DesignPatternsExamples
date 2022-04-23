package com.designpatterns.decorator.calculator;

public class Test {
    public static void main(String[] args){
        Calculator multiply = new Multiply(new ConcreteCalculator(5),5);
        System.out.println(multiply.calculate());
    }
}
