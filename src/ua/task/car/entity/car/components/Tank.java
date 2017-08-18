package ua.task.car.entity.car.components;

import ua.task.car.entity.utility.GasBrand;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Denis Starovoitenko on 18.08.2017.
 */
public class Tank {
    private final int maxCapacity;
    private int currentCapacity;
    private List<GasBrand> availableGas;


    public Tank(int maxCapacity) {
        this(maxCapacity, 0, new ArrayList<>());
    }

    public Tank(int maxCapacity, List<GasBrand> gasBrands) {
        this(maxCapacity, 0, gasBrands);
    }

    public Tank(int maxCapacity, int currentCapacity, List<GasBrand> gasBrands) {
        this.maxCapacity = maxCapacity;
        this.currentCapacity = currentCapacity;
        this.availableGas = gasBrands;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    public List<GasBrand> getAvailableGas() {
        return availableGas;
    }

    public void setAvailableGas(List<GasBrand> availableGas) {
        this.availableGas = availableGas;
    }

    @Override
    public String toString() {
        return "Tank maxCapacity = " + maxCapacity + ", currentCapacity = " + currentCapacity + ";"
                + "\nTank available gas marks = " + availableGas;
    }
}
