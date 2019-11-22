package by.java.nkt.logic;

import by.java.nkt.entity.Time;

public class TimeLogic {
    public int addHour(int hour) {
        Time time = new Time();
        int currentHours = time.getHour();
        time.checkerHour(currentHours + hour);
        return time.getHour();
    }
    public int addMin(int min) {
        Time time = new Time();
        int currentMin = time.getMin();
        time.checkerHour(currentMin+ min);
        return time.getMin();
    }
    public int addSec(int sec) {
        Time time = new Time();
        int currentSec = time.getSec();
        time.checkerHour(currentSec + sec);
        return time.getHour();
    }
}
