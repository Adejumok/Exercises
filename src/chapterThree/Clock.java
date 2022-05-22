package chapterThree;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    public void displayTime() {
        setHour(this.hour);
        setMinute(this.minute);
        setSecond(this.second);
        System.out.println(getHour() + ":" + getMinute() + ":" + getSecond());
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour <= 23) {
            this.hour = hour;
        } else {
            this.hour = 00;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute <= 59) {
            this.minute = minute;
        } else {
            this.minute = 0;
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second <= 59) {
            this.second = second;
        } else {
            this.second = 00;
        }
    }


}


