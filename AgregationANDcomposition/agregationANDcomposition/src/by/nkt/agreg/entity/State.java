package by.nkt.agreg.entity;

import java.util.List;
import java.util.Objects;

// 3. Создать объект класса Государство,
// используя классы Область, Район, Город.
// Методы: вывести на консоль столицу, количество областей, площадь, областные центры
public class State {
    private double area;
    private List<Region> regions;
    private City capitalCity;
    public State() {
    }

    public State(double area, List<Region> regions, City capitalCity) {
        this.area = area;
        this.regions = regions;
        this.capitalCity = capitalCity;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        State state = (State) o;
        return Double.compare(state.area, area) == 0 &&
                Objects.equals(regions, state.regions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(area, regions);
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    public City getCapitalCity() {
        return capitalCity;
    }

    public void setCapitalCity(City capitalCity) {
        this.capitalCity = capitalCity;
    }
}
