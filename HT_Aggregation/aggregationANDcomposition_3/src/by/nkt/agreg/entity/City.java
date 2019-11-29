package by.nkt.agreg.entity;

import java.util.List;

public class City {
    private List<District> districtList;
    private double area;

    public City() {
    }

    public City(List<District> districtList, double area) {
        this.districtList = districtList;
        this.area = area;
    }

    public List<District> getDistrictList() {
        return districtList;
    }

    public void setDistrictList(List<District> districtList) {
        this.districtList = districtList;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
