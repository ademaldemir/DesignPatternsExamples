package com.designpatterns.facade.carsystem;

public class CarApp {
    public static void main(String[] args) {
        CarEngineFacade carEngineFacade = new CarEngineFacade();
        carEngineFacade.startEngine();
        System.out.println("🏎️🏎️🏎️🏎️🏎️🏎️🏎️🏎️");
        carEngineFacade.stopEngine();
    }
}
