package ua.task.car.entity.car;

import ua.task.car.entity.car.components.Engine;
import ua.task.car.entity.car.components.Tank;
import ua.task.car.entity.car.components.Transmission;

/**
 * Created by Denis Starovoitenko on 18.08.2017.
 */
public class VehicleComponents {
    private Transmission transmission;
    private Engine engine;
    private Tank tank;

    public VehicleComponents(Transmission transmission, Engine engine, Tank tank) {
        this.transmission = transmission;
        this.engine = engine;
        this.tank = tank;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tank getTank() {
        return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }

    @Override
    public String toString() {
        return "****** VehicleComponents ******"
                + transmission + "\n"
                + engine + "\n"
                + tank;
    }
}
