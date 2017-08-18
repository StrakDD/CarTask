package ua.task.car.entity.car.components;

/**
 * Created by Denis Starovoitenko on 18.08.2017.
 */
public class Engine {
    private int component1;
    private int component2;

    public int getComponent1() {
        return component1;
    }

    public void setComponent1(int component1) {
        this.component1 = component1;
    }

    public int getComponent2() {
        return component2;
    }

    public void setComponent2(int component2) {
        this.component2 = component2;
    }

    @Override
    public String toString() {
        return "Engine consists of " + "component1 = " + component1 + ", component2 = " + component2;
    }
}
