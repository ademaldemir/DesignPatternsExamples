package com.designpatterns.decorator.computertype;

// And by implementing Computer interface, we'll define a class which we will, using the Decorator pattern, make susceptible to change during runtime:
public class BasicComputer implements Computer{
    @Override
    public void assemble() {
        System.out.print("Assembling a basic computer.");
    }
}
