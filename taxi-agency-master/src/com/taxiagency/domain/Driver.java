package com.taxiagency.domain;

public class Driver implements Entity {
    private String id;
    private DriversName driversName;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String b) {
    }

    public Driver(String id, DriversName driversName) {
        this.id = id;
        this.driversName = driversName;
    }


    @Override
    public String toString() {
        return "(id:" + id + ", driversName:" + driversName + ")";
    }
}