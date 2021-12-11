package com.taxiagency.domain;

public class Trip implements Entity {
    private String id;
    private Route route;
    private Driver driver;
    private Car car;
    private Passenger passenger;
    private String durationMins;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Trip(String id, Route route, Driver driver, Car car, Passenger passenger, String durationMins) {
        this.id = id;
        this.route = route;
        this.driver = driver;
        this.car = car;
        this.passenger = passenger;
        this.durationMins = durationMins;
    }

    private static String randomDurationMins() {
        String duration = "123456789";
        StringBuilder rDurMins = new StringBuilder();
        for (int b = 0; b < 2; b++) {
            rDurMins.append(duration.charAt((int) (Math.random() * duration.length())));
        }
        String randomDurationMins = rDurMins.toString();
        String formattedDurationMins = randomDurationMins + "hour(s)";

        return formattedDurationMins;
    }

    public void setDurationMins() {
        this.durationMins = randomDurationMins();
    }

    @Override
    public String toString() {
        return "\n(id:" + id + ",\n route:" + route + ",\n driver:" + driver + ",\n car:" +
                car + ",\n passenger:" + passenger + ",\n durationMins:" + durationMins +")\n";
    }

}
