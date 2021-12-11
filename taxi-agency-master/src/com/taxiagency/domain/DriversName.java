package com.taxiagency.domain;

import java.util.Random;

public enum DriversName {
    Mateo, Lena, Ivan, Alex, Lenora, John, Ben, Lisa;

    public static DriversName wishName() {
        DriversName[] drivers = DriversName.values();
        Random generator = new Random();
        return drivers[generator.nextInt(drivers.length)];
    }
}

