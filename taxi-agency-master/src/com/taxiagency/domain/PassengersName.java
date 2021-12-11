package com.taxiagency.domain;

import java.util.Random;

public enum PassengersName {
    Mark, David, Maya, Jack, Duncan, Volf;

    public static PassengersName nameP() {
        PassengersName[] names = PassengersName.values();
        Random generator = new Random();
        return names[generator.nextInt(names.length)];
    }
}
