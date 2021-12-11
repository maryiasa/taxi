package com.taxiagency.dao;

import com.taxiagency.domain.Driver;

import java.util.*;

public class DriverRamDao extends RamDao implements DriverDao {

    private Map<String, Driver> ramDriver;

    public DriverRamDao() {

        this.ramDriver = new HashMap<>();
    }

    @Override
    public List<Driver> findByName(String driversName) {
        return this.find(driversName);
    }
}
