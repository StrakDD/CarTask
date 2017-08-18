package ua.task.car.entity.car;

import ua.task.car.entity.utility.DriverLicenseCategory;

import java.util.List;

/**
 * Created by Denis Starovoitenko on 18.08.2017.
 */
public class Car extends Vehicle {

    public Car(){
    }

    public Car(VehicleComponents vehicleComponents, String number, List<DriverLicenseCategory> driverLicenseCategories) {
        super(vehicleComponents, number, driverLicenseCategories);
    }

    @Override
    public void move() {
        System.out.println("Car is moving.");
    }
}
