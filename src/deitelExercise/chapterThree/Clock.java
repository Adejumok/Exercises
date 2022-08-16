package deitelExercise.chapterThree;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24){
            throw new IllegalArgumentException("hour must be 0-23");
        }
        if (minute < 0 || minute >= 59) {
            throw new IllegalArgumentException("minute must be from 0-59");
        }
        if (second < 0 || second >= 59) {
            throw new IllegalArgumentException("second must be from 0-59");
        }

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
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be from 0-23");
        }
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute >= 59) {
            throw new IllegalArgumentException("minute must be from 0-59");
        }
            this.minute = minute;
        }


    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second < 0 || second >= 59) {
            throw new IllegalArgumentException("second must be from 0-59");
        }
        this.second = second;
    }



}


