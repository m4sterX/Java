package by.nkt.agreg.logic;

import by.nkt.agreg.entity.TouristTour;
import by.nkt.agreg.entity.TypeOfTour;

import java.util.ArrayList;
import java.util.List;

//Реализовать выбор и сортировку путевок.
public class TouristTourLogic {
    public List<TouristTour> findTouristTourByType(List<TouristTour> touristTours, TypeOfTour typeOfTour) {

        List<TouristTour> newListOfTours = new ArrayList<>();

        for (TouristTour i : touristTours
             ) {
            if (i.getTypeOfTour().equals(typeOfTour)) {
                newListOfTours.add(i);
            }
        }
        return newListOfTours;
    }
    public List<TouristTour> sortByDays(List<TouristTour> touristTours) {
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < touristTours.size()-1; i++) {
                if(touristTours.get(i).getNumberOfDays() > touristTours.get(i+1).getNumberOfDays()){
                    isSorted = false;

                    buf = touristTours.get(i).getNumberOfDays();
                    touristTours.get(i).setNumberOfDays(touristTours.get(i+1).getNumberOfDays());
                    touristTours.get(i+1).setNumberOfDays(buf);
                }
            }
        }
        return touristTours;
    }
}
