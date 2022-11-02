package com.learn.slide5.innerclasses;

public class Ship {

    private String name;

    private ShipMotor shipMotor;

    public Ship() {}

    public Ship(String name, ShipMotor shipMotor) {
        this.shipMotor = shipMotor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShipMotor getShipMotor() {
        return shipMotor;
    }

    public void setShipMotor(ShipMotor shipMotor) {
        this.shipMotor = shipMotor;
    }

    public static class ShipMotor {

        private double power;

        public ShipMotor() {}

        public ShipMotor(double power) {
            this.power = power;
        }

        public double getPower() {
            return power;
        }

        public void setPower(double power) {
            this.power = power;
        }
    }
}
