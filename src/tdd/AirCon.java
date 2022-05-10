package tdd;

public class AirCon {
    private boolean on;
    private boolean temperature;
    private int temp;

    public AirCon() {
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean getTemperature() {
        return temperature;
    }

    public void increaseTemperature(boolean temperature) {
        this.temperature = temperature;
    }

    public void decreaseTemperature(boolean temperature) {
        this.temperature = temperature;
    }

    public void increaseTemperatureBeyond30(int temp) {
        if (temp > 30){this.temperature = false;}
    }

    public void decreaseTemperatureBelow16(int temp) {
        if (temp < 16) {this.temperature = false;}
    }

}
