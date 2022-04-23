package com.designpatterns.decorator.os;

public class RollbackIos extends IosDecorator{
    public RollbackIos(Ios ios) {
        super(ios);
    }

    @Override
    public void update() {
        getIos().update();
        rollBack();
    }

    private void rollBack() {
        System.out.println("Updated OS is rolling back.");
    }
}
