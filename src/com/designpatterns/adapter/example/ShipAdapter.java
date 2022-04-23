package com.designpatterns.adapter.example;

public class ShipAdapter implements Ship {

    CargoShip cargoShip;

    public ShipAdapter(CargoShip cargoShip) {
        this.cargoShip = cargoShip;
    }

    @Override
    public int speed() {
        return cargoShip.cargoShipSpeed();
    }
}
