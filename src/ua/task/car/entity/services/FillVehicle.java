package ua.task.car.entity.services;

import ua.task.car.entity.driver.Driver;
import ua.task.car.entity.stations.GasStation;

/**
 * Created by Denis Starovoitenko on 18.08.2017.
 */
public interface FillVehicle {
    void fillVehicle(Driver driver, GasStation gasStation);
}
