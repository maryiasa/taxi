package com.taxiagency.dao;

import com.taxiagency.domain.Passenger;

import java.util.List;

public interface PassengerDao extends Dao {
    List<Passenger> findByName (String passengersName);
    List<Passenger> findByPhoneRegexp(String passengersPhoneNumber);
}
