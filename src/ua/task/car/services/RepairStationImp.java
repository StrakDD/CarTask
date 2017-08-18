package ua.task.car.services;

import ua.task.car.entity.car.Vehicle;
import ua.task.car.entity.services.PumpWheels;
import ua.task.car.entity.services.RepairEngine;
import ua.task.car.entity.services.RepairTransmission;
import ua.task.car.entity.stations.RepairStation;
import ua.task.car.entity.stations.Station;
import ua.task.car.entity.stations.utility.Mechanic;
import ua.task.car.entity.stations.utility.Task;

import java.util.List;

/**
 * Created by Denis Starovoitenko on 18.08.2017.
 */
public class RepairStationImp implements RepairEngine, RepairTransmission, PumpWheels {

    @Override
    public void repairEngine(Vehicle vehicle, RepairStation repairStation) {

        Mechanic mechanic = checkRepairPossibility(repairStation.getWorkers(), Task.ENGINE);
        if (mechanic == null){
            System.out.println("Cant repair engine!");
            return;
        }

        while (!repairStation.getBoxes()){
            System.out.println("Waiting for free box.");
        }

        mechanic.repair(vehicle);
        System.out.println("Mechanic repair vehicle engine.");

    }

    @Override
    public void repairTransmission(Vehicle vehicle, RepairStation repairStation) {
        Mechanic mechanic = checkRepairPossibility(repairStation.getWorkers(), Task.TRANSMISSION);
        if (mechanic == null){
            System.out.println("Cant repair engine!");
            return;
        }

        while (!repairStation.getBoxes()){
            System.out.println("Waiting for free box.");
        }

        mechanic.repair(vehicle);
        System.out.println("Mechanic repair vehicle transmission.");
    }

    @Override
    public void pumpWheels(Vehicle vehicle, Station station) {
        Mechanic mechanic = checkPumpPossibility(station.getWorkers());
        if (mechanic == null){
            System.out.println("All mechanics are busy!");
            return;
        }

        mechanic.pump(vehicle);
        System.out.println("Mechanic pumped wheels.");

    }

    public Mechanic checkRepairPossibility(List<Mechanic> workers, Task task){
        for (Mechanic worker : workers) {
            if (worker.getAvailableTasks().contains(task) && worker.isNoWork()){
                return worker;
            }
        }
        return null;
    }

    public Mechanic checkPumpPossibility(List<Mechanic> workers){
        for (Mechanic worker : workers) {
            if (worker.isNoWork()){
                return worker;
            }
        }
        return null;
    }
}
