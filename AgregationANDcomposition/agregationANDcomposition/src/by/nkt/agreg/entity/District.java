package by.nkt.agreg.entity;

import java.util.Objects;

public class District {

    private double area;

    public District() {
    }

    public District(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        District district = (District) o;
        return Double.compare(district.area, area) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(area);
    }

    @Override
    public String toString() {
        return "District{" +
                "area=" + area +
                '}';
    }
}
