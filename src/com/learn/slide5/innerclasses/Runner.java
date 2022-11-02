package com.learn.slide5.innerclasses;

public class Runner {

    public static void main(String[] args) {
        Ship.ShipMotor shipMotor = new Ship.ShipMotor();

        IGame iGame = new IGame() {
            @Override
            public void play() {
                System.out.println("PLay");
            }
        };
    }
}
