package ua.task.car.entity.car;

import ua.task.car.entity.utility.DriverLicenseCategory;

import java.util.List;

/**
 * Created by Denis Starovoitenko on 17.08.2017.
 */
public abstract class Vehicle {
    private VehicleComponents vehicleComponents;
    private String number;
    private List<DriverLicenseCategory> driverLicenseCategories;

    public Vehicle() {
    }

    public Vehicle(VehicleComponents vehicleComponents, String number, List<DriverLicenseCategory> driverLicenseCategories) {
        this.vehicleComponents = vehicleComponents;
        this.number = number;
        this.driverLicenseCategories = driverLicenseCategories;
    }

    public VehicleComponents getVehicleComponents() {
        return vehicleComponents;
    }

    public void setVehicleComponents(VehicleComponents vehicleComponents) {
        this.vehicleComponents = vehicleComponents;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public List<DriverLicenseCategory> getDriverLicenseCategories() {
        return driverLicenseCategories;
    }

    public void setDriverLicenseCategories(List<DriverLicenseCategory> driverLicenseCategories) {
        this.driverLicenseCategories = driverLicenseCategories;
    }

    public abstract void move();

    @Override
    public String toString() {
        return vehicleComponents
                + "\nvehicle number" + number
                + ", driverLicenseCategories = " + driverLicenseCategories;
    }
}
