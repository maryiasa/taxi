import com.taxiagency.dao.*;
import com.taxiagency.domain.*;

import java.util.List;


public class Main {
    public static void main(String[] args) {

        Dao<Car> car1 = new CarRamDao();

        Dao<Driver> drivers = new DriverRamDao();

        Dao<Passenger> passengers = new PassengerRamDao();

        Dao<Trip> trips = new TripRamDao();

        for (int t = 0; t < 10; t++) {
            String id = String.valueOf(t + 1);

            Car car = new Car(id, Color.wishColor(), "");
            car.setCarsNumber();
            car1.save(car);
            // save car
            Driver driver = new Driver(id, DriversName.wishName());
            drivers.save(driver);
            // save driver
            Passenger passenger1 = new Passenger(id, PassengersName.nameP(), "");
            passenger1.setPassengersPhoneNumber("123456789");
            passengers.save(passenger1);
            // save trip
            Trip trip1 = new Trip(id, Route.wishRoute(), driver, car, passenger1, "");
            trip1.setDurationMins();
            trips.save(trip1);
        }

        List<Car> allCars = car1.findAll();
        System.out.println(allCars);

        List<Driver> allDrivers = drivers.findAll();
        System.out.println(allDrivers);

        List<Passenger> allPassengers = passengers.findAll();
        System.out.println(allPassengers);

        List<Trip> allTrips = trips.findAll();
        System.out.println(allTrips);

        System.out.println("Find by Passengers Name 'Mark': " + ((PassengerRamDao) passengers).findByName("Mark"));
        System.out.println("Find by Passengers Phone '111-34-24': " + ((PassengerRamDao) passengers).findByPhoneRegexp("123-45-67"));
        System.out.println("Find by Drivers Name 'Mateo': " + ((DriverRamDao) drivers).findByName("Mateo"));
        System.out.println("Find by Cars Color 'Black': " + ((CarRamDao) car1).findByColor(Color.Black));

        String carsDir = "D:\\saganovichm\\taxiagency\\cars";
        String fileCarsName = "\\cars.txt";
        CarFileDao a = new CarFileDao();
        a.createFile(carsDir, fileCarsName, allCars);

        String driversDir = "D:\\saganovichm\\taxiagency\\drivers";
        String fileDriversName = "\\drivers.txt";
        DriverFileDao b = new DriverFileDao();
        b.createFile(driversDir, fileDriversName, allDrivers);

        String passengersDir = "D:\\saganovichm\\taxiagency\\passengers";
        String filePassengersName = "\\passengers.txt";
        PassengerFileDao c = new PassengerFileDao();
        c.createFile(passengersDir, filePassengersName, allPassengers);

        String tripDir = "D:\\saganovichm\\taxiagency\\trips";
        String fileTripsName = "\\trips.txt";
        TripFileDao p = new TripFileDao();
        p.createFile(tripDir, fileTripsName, allTrips);
    }
}

