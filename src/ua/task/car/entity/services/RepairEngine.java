package ua.task.car.entity.services;

import ua.task.car.entity.car.Vehicle;
import ua.task.car.entity.stations.RepairStation;

/**
 * Created by Denis Starovoitenko on 18.08.2017.
 */
public interface RepairEngine {
    void repairEngine(Vehicle vehicle, RepairStation repairStation);
}
