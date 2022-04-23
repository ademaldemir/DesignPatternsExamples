package com.designpatterns.decorator.computertype;

public class GamingDecorator extends ComputerDecorator{
    public GamingDecorator(Computer computer) {
        super(computer);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Adding characteristics of a gaming computer! ");
    }
}
