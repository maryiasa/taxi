package com.taxiagency.dao;

import com.taxiagency.domain.Passenger;
import com.taxiagency.domain.PassengersName;

import java.util.*;

public class PassengerRamDao extends RamDao implements PassengerDao {

    private Map<String, Passenger> ramPassengers;

    public PassengerRamDao() {

        this.ramPassengers = new HashMap<>();
    }

    @Override
    public List<Passenger> findByName(String passengersName) {
        return this.find(passengersName);
    }

    @Override
    public List<Passenger> findByPhoneRegexp(String passengersPhoneNumber) {
        return this.find(passengersPhoneNumber);

    }
}
