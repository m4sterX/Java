package by.nkt.agreg.logic;

import by.nkt.agreg.entity.City;
import by.nkt.agreg.entity.Region;
import by.nkt.agreg.entity.State;

import java.util.ArrayList;
import java.util.List;

// Методы: вывести на консоль столицу, количество областей, площадь, областные центры
public class StateLogic {

    public List<City> returnRegionCenter(State state) {
        List<City> regionalCenterCities= new ArrayList<>();
        List<Region> regions = state.getRegions();
        for (Region i: regions
             ) {
            regionalCenterCities.add(i.getRegionalCenter());
        }
        return regionalCenterCities;
    }

    public double returnStateArea(State state) {
         return state.getArea();
    }

    public int returnRegions(State state) {
        List<Region> regions = state.getRegions();
        return regions.size();
    }
    public City returnCapitalCity(State state) {
        return state.getCapitalCity();
    }
 }
