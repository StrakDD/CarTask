package ua.task.car.entity.stations;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Denis Starovoitenko on 18.08.2017.
 */
public abstract class Station<T> {
    private String name;
    private List<T> workers;

    public Station(String name) {
        this.name = name;
        this.workers = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<T> getWorkers() {
        return workers;
    }

    public void setWorkers(List<T> workers) {
        this.workers = workers;
    }

    public void addFiller(T worker){
        workers.add(worker);
    }

    @Override
    public String toString() {
        return "Station{" +
                "name='" + name + '\'' +
                ", workers=" + workers +
                '}';
    }
}
