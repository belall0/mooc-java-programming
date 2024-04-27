package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {

    private boolean status;

    public TemperatureSensor() {
        this.status = false;
    }

    public boolean isOn() {
        return this.status;
    }

    public void setOn() {
        this.status = true;

    }

    public void setOff() {
        this.status = false;
    }

    public int read() {
        if (this.status) {
            return getRandomNum();
        } else {
            throw new IllegalStateException();
        }
    }

    public int getRandomNum() {
        int randNum = new Random().nextInt(61) - 30;
        return randNum;
    }

}
