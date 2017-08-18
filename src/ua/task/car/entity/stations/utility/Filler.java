package ua.task.car.entity.stations.utility;

import ua.task.car.entity.car.Vehicle;
import ua.task.car.entity.utility.human.Human;

/**
 * Created by Denis Starovoitenko on 18.08.2017.
 */
public class Filler extends Human{
    private boolean free;

    public Filler(Human human) {
        super(human);
        this.free = true;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    public void pump(Vehicle vehicle){
        System.out.println("Pumping up wheels.");
    }

    public void cleanGlasses(Vehicle vehicle){
        System.out.println("Cleaning glasses.");
    }
}
