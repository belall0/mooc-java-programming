package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    public boolean isOn() {
        for (Sensor s : sensors) {
            if (!s.isOn()) {
                return false;
            }
        }

        return true;
    }

    public void setOn() {
        sensors.stream().forEach(s -> s.setOn());
    }

    public void setOff() {
        sensors.stream().forEach(s -> s.setOff());

    }

    public List<Integer> readings() {
        return this.readings;
    }

    public int read() {
        if (sensors.isEmpty() || !this.isOn()) {
            throw new IllegalStateException();
        }

        int val = sensors.stream().map(s -> s.read()).reduce(0, (prev, next) -> prev += next) / sensors.size();

        readings.add(val);

        return val;
    }
}
