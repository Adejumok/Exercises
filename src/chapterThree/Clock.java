package chapterThree;

public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    public String displayTime(String time){
        String displayTime = null;

        System.out.printf("The time is %d:%d:%d%n", getHour(), getMinute(), getSecond());

        return displayTime;

    }

    public void setHour(int hour) {
        if (hour <= 23)
        {this.hour = hour;
        }
        else {hour = 0;
        }
    }

    public int getHour() {
        return hour;
    }


    public void setMinute(int minute) {
        if (minute <= 59)
        {this.minute = minute;
        }
        else {minute = 0;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setSecond(int second) {
        if (second <= 59)
        {this.second = second;
        }
        else {second = 0;
        }
    }

    public int getSecond() {
        return second;
    }



}


