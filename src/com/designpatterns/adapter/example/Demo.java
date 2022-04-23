package com.designpatterns.adapter.example;

public class Demo {
    public static void main(String[] args) {
//        Ship ship = new SpaceShip();
//        System.out.println(ship.speed());

        CargoShip cargoShip = new CargoShip();
        ShipAdapter adapter = new ShipAdapter(cargoShip);
        System.out.println(adapter.speed());
        //System.out.println(cargoShip.cargoShipSpeed());
    }
}
