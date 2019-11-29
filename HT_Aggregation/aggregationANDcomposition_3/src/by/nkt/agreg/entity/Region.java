package by.nkt.agreg.entity;

import java.util.List;
import java.util.Objects;

public class Region {
    private double area;

    private City regionalCenter;

    private List<City> cities;

    public Region(double area, City regionalCenter, List<City> cities) {
        this.area = area;
        this.regionalCenter = regionalCenter;
        this.cities = cities;
    }

    public Region() {
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Region{" +
                "area=" + area +
                ", regionalCenter=" + regionalCenter +
                ", cities=" + cities +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return Double.compare(region.area, area) == 0 &&
                Objects.equals(regionalCenter, region.regionalCenter) &&
                Objects.equals(cities, region.cities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(area, regionalCenter, cities);
    }

    public City getRegionalCenter() {
        return regionalCenter;
    }

    public void setRegionalCenter(City regionalCenter) {
        this.regionalCenter = regionalCenter;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }
}
