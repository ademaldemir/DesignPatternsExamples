package com.designpatterns.bridge.carproducts;

public class CarFactory {
    public static void main(String[] args) {
        Product central_locking_system = new CentralLocking("Central Locking System");
        Product autonomous_driving_system = new AutonomousDriving("Autonomous Driving System");
        Product remote_motor_control_system = new StartMotorOnApp("Remote Motor Control System");

        Mercedes mercedesE220Model = new Mercedes(central_locking_system, "Mercedes E220 Model");
        mercedesE220Model.produceProduct();
        mercedesE220Model.assemble();
        mercedesE220Model.printDetails();

        System.out.println("🚗🚗🚗🚗🚗🚗🚗🚗");

        Tesla modelX = new Tesla(autonomous_driving_system, "Model X");
        modelX.produceProduct();
        modelX.assemble();
        modelX.printDetails();

    }
}

