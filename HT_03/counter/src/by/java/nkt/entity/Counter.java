package by.java.nkt.entity;

import java.util.Objects;

public class Counter {
    private double num;
    private double distanceMax;
    private double distanceMin;

    @Override
    public String toString() {
        return "Counter{" +
                "num=" + num +
                ", distanceMax=" + distanceMax +
                ", distanceMin=" + distanceMin +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Counter counter = (Counter) o;
        return Double.compare(counter.num, num) == 0 &&
                Double.compare(counter.distanceMax, distanceMax) == 0 &&
                Double.compare(counter.distanceMin, distanceMin) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, distanceMax, distanceMin);
    }

    public double getDistanceMax() {
        return distanceMax;
    }

    public void setDistanceMax(double distanceMax) {
        this.distanceMax = distanceMax;
    }

    public double getDistanceMin() {
        return distanceMin;
    }

    public void setDistanceMin(double distanceMin) {
        this.distanceMin = distanceMin;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public Counter() {
        this.num = 0;
        this.distanceMax = 0;
        this.distanceMin = 0;
    }

    public Counter(double num, double distanceMax, double distanceMin) {
        this.num = num;
        this.distanceMax = distanceMax;
        this.distanceMin = distanceMin;
    }
    public double currentNum() {
        return num;
    }
}
