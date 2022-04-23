package com.designpatterns.decorator.computertype;

public class CreateComputer {
    public static void main(String[] args) {
        BasicComputer basicComputer = new BasicComputer();
        GamingDecorator gamingDecorator = new GamingDecorator(basicComputer);

        WorkingComputer workingComputer = new WorkingComputer(basicComputer);
        workingComputer.assemble();
    }
}
