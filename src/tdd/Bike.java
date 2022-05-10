package tdd;

public class Bike {
    private boolean on;
    private int speed;
    boolean acceleration;
    boolean decceleration;

    public Bike() {

    }

    public boolean isOn;

    public boolean setOn(boolean on) {

        this.isOn = on;

        if (isOn == true) {
            acceleration = true;
        }

        boolean getOn = true;
        {
            return getOn;
        }

    }

    public void setAcceleration(boolean acceleration) {
        this.acceleration = true;
    }

        public int gear(int speed){
        int gear = 0;
            if (speed <= 20) {
                gear = speed + 1;
            }

            if (speed >= 21 && speed <= 30) {
                gear = speed + 2;
            }

            if (speed >= 31 && speed <= 40) {
                gear = speed + 3;
            }

            if (speed >= 41) {
                gear = speed + 4;
            }
            return gear;
    }

    public void setDecceleration(boolean decceleration) {
        this.decceleration = true;
    }

    public int gearD(int speed){
        int gearD = 0;
        if (speed <= 20) {
            gearD = speed - 1;
        }

        if (speed >= 21 && speed <= 30) {
            gearD = speed - 2;
        }

        if (speed >= 31 && speed <= 40) {
            gearD = speed - 3;
        }

        if (speed >= 41) {
            gearD = speed - 4;
        }
        return gearD;
    }
}