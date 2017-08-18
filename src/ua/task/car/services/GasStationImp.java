package ua.task.car.services;

import ua.task.car.entity.car.Vehicle;
import ua.task.car.entity.driver.Driver;
import ua.task.car.entity.services.CleanGlasses;
import ua.task.car.entity.services.FillVehicle;
import ua.task.car.entity.services.PumpWheels;
import ua.task.car.entity.stations.GasStation;
import ua.task.car.entity.stations.Station;
import ua.task.car.entity.stations.utility.Filler;
import ua.task.car.entity.utility.GasBrand;

import java.util.List;

/**
 * Created by Denis Starovoitenko on 18.08.2017.
 */
public class GasStationImp implements FillVehicle, CleanGlasses, PumpWheels {

    @Override
    public void pumpWheels(Vehicle vehicle, Station station) {
        Filler filler = checkPossibility(station.getWorkers());
        while (filler == null){
            System.out.println("All mechanics are busy!");
            filler = checkPossibility(station.getWorkers());
        }

        filler.pump(vehicle);
        System.out.println("Work done!");
    }

    @Override
    public void fillVehicle(Driver driver, GasStation gasStation) {
        GasBrand gasBrand = driver.chooseGas();
        System.out.println("Checking for possibility of filling with chosen gas Brand");
        System.out.println("Filler filling the tank");
    }

    @Override
    public void cleanGlasses(Vehicle vehicle, GasStation gasStation) {
        Filler filler = checkPossibility(gasStation.getWorkers());
        while (filler == null){
            System.out.println("All mechanics are busy!");
            filler = checkPossibility(gasStation.getWorkers());
        }

        filler.cleanGlasses(vehicle);
        System.out.println("Work done!");
    }

    public Filler checkPossibility(List<Filler> workers){
        for (Filler worker : workers) {
            if (worker.isFree()){
                return worker;
            }
        }
        return null;
    }
}
