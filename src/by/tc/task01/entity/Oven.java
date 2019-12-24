package by.tc.task01.entity;

import java.util.Objects;

public class Oven extends Appliance{
    private int POWER_CONSUMPTION;
    private int CAPACITY;
    private int DEPTH;
    private double WEIGHT;
    private double HEIGHT;
    private double WIDTH;

    public Oven(int POWER_CONSUMPTION, int CAPACITY, int DEPTH, double WEIGHT, double HEIGHT, double WIDTH) {
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
        this.CAPACITY = CAPACITY;
        this.DEPTH = DEPTH;
        this.WEIGHT = WEIGHT;
        this.HEIGHT = HEIGHT;
        this.WIDTH = WIDTH;
    }

    public Oven() {
    }

    public int getPOWER_CONSUMPTION() {
        return POWER_CONSUMPTION;
    }

    public void setPOWER_CONSUMPTION(int POWER_CONSUMPTION) {
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
    }

    public int getCAPACITY() {
        return CAPACITY;
    }

    public void setCAPACITY(int CAPACITY) {
        this.CAPACITY = CAPACITY;
    }

    public int getDEPTH() {
        return DEPTH;
    }

    public void setDEPTH(int DEPTH) {
        this.DEPTH = DEPTH;
    }

    public double getWEIGHT() {
        return WEIGHT;
    }

    public void setWEIGHT(double WEIGHT) {
        this.WEIGHT = WEIGHT;
    }

    public double getHEIGHT() {
        return HEIGHT;
    }

    public void setHEIGHT(double HEIGHT) {
        this.HEIGHT = HEIGHT;
    }

    public double getWIDTH() {
        return WIDTH;
    }

    public void setWIDTH(double WIDTH) {
        this.WIDTH = WIDTH;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Oven oven = (Oven) o;
        return POWER_CONSUMPTION == oven.POWER_CONSUMPTION &&
                CAPACITY == oven.CAPACITY &&
                DEPTH == oven.DEPTH &&
                Double.compare(oven.WEIGHT, WEIGHT) == 0 &&
                Double.compare(oven.HEIGHT, HEIGHT) == 0 &&
                Double.compare(oven.WIDTH, WIDTH) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), POWER_CONSUMPTION, CAPACITY, DEPTH, WEIGHT, HEIGHT, WIDTH);
    }

    @Override
    public String toString() {
        return "Oven{" +
                "POWER_CONSUMPTION=" + POWER_CONSUMPTION +
                ", CAPACITY=" + CAPACITY +
                ", DEPTH=" + DEPTH +
                ", WEIGHT=" + WEIGHT +
                ", HEIGHT=" + HEIGHT +
                ", WIDTH=" + WIDTH +
                '}';
    }
}
