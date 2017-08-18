package ua.task.car.entity.stations;

import ua.task.car.entity.stations.utility.Mechanic;

/**
 * Created by Denis Starovoitenko on 18.08.2017.
 */
public class RepairStation extends Station<Mechanic> {
    private boolean boxes;

    public RepairStation(String name, boolean boxes) {
        super(name);
        this.boxes = boxes;
    }

    public boolean getBoxes() {
        return boxes;
    }

    public void setBoxes(boolean boxes) {
        this.boxes = boxes;
    }

    @Override
    public String toString() {
        return "RepairStation{" +
                "boxes=" + boxes +
                '}';
    }
}
