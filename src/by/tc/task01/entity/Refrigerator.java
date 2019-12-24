package by.tc.task01.entity;

import java.util.Objects;

public class Refrigerator extends Appliance{
    private int POWER_CONSUMPTION;
    private int FREEZER_CAPACITY;
    private double OVERALL_CAPACITY;
    private double WEIGHT;
    private double HEIGHT;
    private double WIDTH;

    public Refrigerator() {
    }

    public Refrigerator(int POWER_CONSUMPTION, int FREEZER_CAPACITY, double OVERALL_CAPACITY, double WEIGHT, double HEIGHT, double WIDTH) {
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
        this.FREEZER_CAPACITY = FREEZER_CAPACITY;
        this.OVERALL_CAPACITY = OVERALL_CAPACITY;
        this.WEIGHT = WEIGHT;
        this.HEIGHT = HEIGHT;
        this.WIDTH = WIDTH;
    }

    public int getPOWER_CONSUMPTION() {
        return POWER_CONSUMPTION;
    }

    public void setPOWER_CONSUMPTION(int POWER_CONSUMPTION) {
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
    }

    public int getFREEZER_CAPACITY() {
        return FREEZER_CAPACITY;
    }

    public void setFREEZER_CAPACITY(int FREEZER_CAPACITY) {
        this.FREEZER_CAPACITY = FREEZER_CAPACITY;
    }

    public double getOVERALL_CAPACITY() {
        return OVERALL_CAPACITY;
    }

    public void setOVERALL_CAPACITY(double OVERALL_CAPACITY) {
        this.OVERALL_CAPACITY = OVERALL_CAPACITY;
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
        Refrigerator that = (Refrigerator) o;
        return POWER_CONSUMPTION == that.POWER_CONSUMPTION &&
                FREEZER_CAPACITY == that.FREEZER_CAPACITY &&
                Double.compare(that.OVERALL_CAPACITY, OVERALL_CAPACITY) == 0 &&
                Double.compare(that.WEIGHT, WEIGHT) == 0 &&
                Double.compare(that.HEIGHT, HEIGHT) == 0 &&
                Double.compare(that.WIDTH, WIDTH) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(POWER_CONSUMPTION, FREEZER_CAPACITY, OVERALL_CAPACITY, WEIGHT, HEIGHT, WIDTH);
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "POWER_CONSUMPTION=" + POWER_CONSUMPTION +
                ", FREEZER_CAPACITY=" + FREEZER_CAPACITY +
                ", OVERALL_CAPACITY=" + OVERALL_CAPACITY +
                ", WEIGHT=" + WEIGHT +
                ", HEIGHT=" + HEIGHT +
                ", WIDTH=" + WIDTH +
                '}';
    }
}
