package ua.task.car.entity.stations;

import ua.task.car.entity.stations.utility.Filler;
import ua.task.car.entity.utility.GasBrand;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Denis Starovoitenko on 18.08.2017.
 */
public class GasStation extends Station<Filler> {

    private boolean gasFillings;
    private Map<GasBrand, Integer> gas;

    public GasStation(String name, boolean gasFillings) {
        super(name);
        this.gasFillings = gasFillings;
        this.gas = new HashMap<>();
    }

    public boolean isGasFillings() {
        return gasFillings;
    }

    public void setGasFillings(boolean gasFillings) {
        this.gasFillings = gasFillings;
    }

    public Map<GasBrand, Integer> getGas() {
        return gas;
    }

    public void setGas(Map<GasBrand, Integer> gas) {
        this.gas = gas;
    }

    public void addGas(GasBrand gasBrand, Integer quantity){
        gas.put(gasBrand, quantity);
    }

    @Override
    public String toString() {
        return "GasStation{" +
                "name='" + getName() + '\'' +
                ", gasFillings=" + gasFillings +
                ", fillers=" + getWorkers() +
                ", gas=" + gas +
                '}';
    }
}
