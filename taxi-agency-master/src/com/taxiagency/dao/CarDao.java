package com.taxiagency.dao;

import com.taxiagency.domain.Car;
import com.taxiagency.domain.Color;

import java.util.List;

public interface CarDao extends Dao {
    Car findByNumber(String carsNumber);
    List<Car> findByColor(Color carsColor);
}
