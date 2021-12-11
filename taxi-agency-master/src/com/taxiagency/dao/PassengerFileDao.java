package com.taxiagency.dao;

import com.taxiagency.domain.Passenger;

import java.util.List;

public class PassengerFileDao extends FileDao implements PassengerDao {
    @Override
    public List<Passenger> findByName(String passengersName) {
        return null;
    }

    @Override
    public List<Passenger> findByPhoneRegexp(String passengersPhoneNumber) {
        return null;
    }

}
