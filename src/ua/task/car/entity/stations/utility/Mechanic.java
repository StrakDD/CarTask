package ua.task.car.entity.stations.utility;

import ua.task.car.entity.car.Vehicle;
import ua.task.car.entity.stations.utility.Task;
import ua.task.car.entity.utility.human.Human;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Denis Starovoitenko on 18.08.2017.
 */
public class Mechanic extends Human {
    private List<Task> availableTasks;
    private boolean noWork;

    public Mechanic(Human human, List<Task> availableTasks) {
        super(human);
        this.availableTasks = availableTasks;
        noWork = true;
    }

    public Mechanic(Human human) {
        this(human, new ArrayList<>());
    }

    public List<Task> getAvailableTasks() {
        return availableTasks;
    }

    public void setAvailableTasks(List<Task> availableTasks) {
        this.availableTasks = availableTasks;
    }

    public void addTask(Task task){
        availableTasks.add(task);
    }

    public boolean isNoWork() {
        return noWork;
    }

    public void setNoWork(boolean noWork) {
        this.noWork = noWork;
    }

    public void repair(Vehicle vehicle){
        System.out.println("Mechanic doing his work");
    }
    public void pump(Vehicle vehicle) {
        System.out.println("Pumping up the wheels!");
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "availableTasks=" + availableTasks +
                ", noWork=" + noWork +
                '}';
    }
}
