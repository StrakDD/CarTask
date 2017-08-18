package ua.task.car.entity.driver;

import ua.task.car.entity.car.Car;
import ua.task.car.entity.utility.GasBrand;
import ua.task.car.entity.utility.human.Human;

/**
 * Created by Denis Starovoitenko on 18.08.2017.
 */
public class Driver extends Human{
    private DriverLicense driverLicense;
    private Car car;

    public Driver(Human human, DriverLicense driverLicense, Car car) {
        super(human);
        this.car = car;
        this.driverLicense = driverLicense;
    }

    public DriverLicense getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(DriverLicense driverLicense) {
        this.driverLicense = driverLicense;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public GasBrand chooseGas(){
        System.out.println("Driver choose gas brand!");
        return GasBrand.AI98;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driverLicense=" + driverLicense +
                ", car=" + car +
                '}';
    }
}
