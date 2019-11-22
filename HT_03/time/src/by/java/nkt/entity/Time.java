package by.java.nkt.entity;

import java.util.Objects;

public class Time {
    private int hour;
    private int min;
    private int sec;

    public Time(int hour, int min, int sec) {
        this.hour = checkerHour(hour);
        this.min = checkerMinOrSec(min);
        this.sec = checkerMinOrSec(sec);
    }

    public Time() {
    }

    public int getHour() {
        return hour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return hour == time.hour &&
                min == time.min &&
                sec == time.sec;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hour, min, sec);
    }

    public void setHour(int hour) {
        this.hour = checkerHour(hour);
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = checkerMinOrSec(min);
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = checkerMinOrSec(sec);
    }
    public int checkerHour(int hour) {
        if(hour > 23 || hour < 0) {
            return 0;
        } else {
            return hour;
        }
    }
    public int checkerMinOrSec(int minOrSec) {
        if (minOrSec > 59 || minOrSec < 0) {
            return 0;
        }
        return minOrSec;
    }
}
