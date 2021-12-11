package com.taxiagency.dao;

import com.taxiagency.domain.Car;
import com.taxiagency.domain.Color;
import com.taxiagency.domain.Entity;

import java.util.*;

public class CarRamDao extends RamDao implements CarDao {

    private Map<String, Car> ramCar;

    public CarRamDao() {

        this.ramCar = new HashMap<>();
    }

    @Override
    public Car findByNumber(String carsNumber) {
        this.find(carsNumber);
        return null;
    }

    @Override
    public List<Car> findByColor(Color carsColor) {
        return this.find(carsColor.toString());

    }
}


