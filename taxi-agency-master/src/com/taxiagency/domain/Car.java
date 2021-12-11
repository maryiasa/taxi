package com.taxiagency.domain;

public class Car implements Entity {
    private String id;
    private Color carsColor;
    private String carsNumber;
@Override
    public String getId() {
        return id;
    }
@Override
    public void setId(String id) {
        this.id = id;
    }

    public Car(String id, Color carsColor, String carsNumber) {
        this.id = id;
        this.carsColor = carsColor;
        this.carsNumber = carsNumber;
    }

    private static String randomCarNumber() {
        String symbols = "QAZWSXEDCRFVTGBYHNUJMIKOL0123456789";
        StringBuilder rCarsNumber = new StringBuilder();
        for (int b = 0; b < 6; b++) {
            rCarsNumber.append(symbols.charAt((int) (Math.random() * symbols.length())));
        }
            String randomCarNumber = rCarsNumber.toString();

            return randomCarNumber;
        }

    public void setCarsNumber() {
        this.carsNumber = randomCarNumber();
    }

    @Override
    public String toString() {
        return "(id:" + id + ", color:" + carsColor + ", carsNumber:" + carsNumber + ")";
    }
}
