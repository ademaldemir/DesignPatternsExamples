package com.designpatterns.decorator.computertype;

public class WorkingComputer extends ComputerDecorator{

    public WorkingComputer(Computer computer) {
        super(computer);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Adding characteristics of a work computer! ");
    }
}
