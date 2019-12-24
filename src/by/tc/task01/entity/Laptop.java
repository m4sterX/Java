package by.tc.task01.entity;

import java.util.Objects;

public class Laptop extends Appliance{
    private double BATTERY_CAPACITY;
    private String OS;
    private int MEMORY_ROM;
    private int SYSTEM_MEMORY;
    private double CPU;
    private int DISPLAY_INCHS;

    public Laptop(double BATTERY_CAPACITY, String OS, int MEMORY_ROM, int SYSTEM_MEMORY, double CPU, int DISPLAY_INCHS) {
        this.BATTERY_CAPACITY = BATTERY_CAPACITY;
        this.OS = OS;
        this.MEMORY_ROM = MEMORY_ROM;
        this.SYSTEM_MEMORY = SYSTEM_MEMORY;
        this.CPU = CPU;
        this.DISPLAY_INCHS = DISPLAY_INCHS;
    }

    public Laptop() {
    }

    public double getBATTERY_CAPACITY() {
        return BATTERY_CAPACITY;
    }

    public void setBATTERY_CAPACITY(double BATTERY_CAPACITY) {
        this.BATTERY_CAPACITY = BATTERY_CAPACITY;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public int getMEMORY_ROM() {
        return MEMORY_ROM;
    }

    public void setMEMORY_ROM(int MEMORY_ROM) {
        this.MEMORY_ROM = MEMORY_ROM;
    }

    public int getSYSTEM_MEMORY() {
        return SYSTEM_MEMORY;
    }

    public void setSYSTEM_MEMORY(int SYSTEM_MEMORY) {
        this.SYSTEM_MEMORY = SYSTEM_MEMORY;
    }

    public double getCPU() {
        return CPU;
    }

    public void setCPU(double CPU) {
        this.CPU = CPU;
    }

    public int getDISPLAY_INCHS() {
        return DISPLAY_INCHS;
    }

    public void setDISPLAY_INCHS(int DISPLAY_INCHS) {
        this.DISPLAY_INCHS = DISPLAY_INCHS;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.BATTERY_CAPACITY, BATTERY_CAPACITY) == 0 &&
                MEMORY_ROM == laptop.MEMORY_ROM &&
                SYSTEM_MEMORY == laptop.SYSTEM_MEMORY &&
                Double.compare(laptop.CPU, CPU) == 0 &&
                DISPLAY_INCHS == laptop.DISPLAY_INCHS &&
                OS.equals(laptop.OS);
    }

    @Override
    public int hashCode() {
        return Objects.hash(BATTERY_CAPACITY, OS, MEMORY_ROM, SYSTEM_MEMORY, CPU, DISPLAY_INCHS);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "BATTERY_CAPACITY=" + BATTERY_CAPACITY +
                ", OS='" + OS + '\'' +
                ", MEMORY_ROM=" + MEMORY_ROM +
                ", SYSTEM_MEMORY=" + SYSTEM_MEMORY +
                ", CPU=" + CPU +
                ", DISPLAY_INCHS=" + DISPLAY_INCHS +
                '}';
    }
}
