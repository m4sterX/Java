package by.tc.task01.entity;

import java.util.Objects;

public class Appliance {
    String type;

    public Appliance(String type) {
        this.type = type;
    }

    public Appliance() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appliance appliance = (Appliance) o;
        return Objects.equals(type, appliance.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        return "Appliance{" +
                "type='" + type + '\'' +
                '}';
    }

}
