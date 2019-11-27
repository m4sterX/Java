package by.nkt.agreg.entity;

import java.util.Objects;

public class Wheel {
    private double barCount;

    public Wheel() {
    }

    public Wheel(double barCount) {
        this.barCount = barCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return Double.compare(wheel.barCount, barCount) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(barCount);
    }

    public double getBarCount() {
        return barCount;
    }

    public void setBarCount(double barCount) {
        this.barCount = barCount;
    }
}
