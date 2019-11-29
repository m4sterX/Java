package by.nkt.agreg.view;

import by.nkt.agreg.entity.City;

import java.util.List;

public class Print {

    public static void printRegionCenter(List<City> cities) {
        for (City i : cities
        ) {
            System.out.println(i);
        }
    }
    public static void printStateArea(double area) {
        System.out.println(area);
    }
    public static void printRegionCount(int count) {
        System.out.println(count);
    }

    public static void printCapital(City city){
        System.out.println(city);
    }
}
