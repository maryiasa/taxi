package com.taxiagency.domain;

public class Passenger implements Entity {
    private String id;
    private PassengersName passengersName;
    private String passengersPhoneNumber;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;

    }

    public Passenger(String id, PassengersName passengersName, String passengersPhoneNumber) {
        this.id = id;
        this.passengersName = passengersName;
        this.passengersPhoneNumber = passengersPhoneNumber;
    }

    private static String pPhoneNumber(String number) {
        String rSymbols = number;
        StringBuilder rPNumber = new StringBuilder();
        for (int p = 0; p < 7 ; p++) {
            rPNumber.append(rSymbols.charAt((int) (Math.random() * rPNumber.length())));

        }
        String pPhoneNumber = rPNumber.toString();
        String formattedPhoneNumber = "(+375 29) " + pPhoneNumber.replaceAll("(\\d{3})(\\d{2})(\\d{2})", "$1-$2-$3");

        return formattedPhoneNumber;
    }

    public void setPassengersPhoneNumber(String number) {
        this.passengersPhoneNumber = pPhoneNumber(number);
    }

    @Override
    public String toString() {
        return "(id:" + id + ", passengersName:" + passengersName + ", passengersPhoneNumber:" +
                passengersPhoneNumber + ")";
    }
}

