package by.java.nkt.logic;

import by.java.nkt.entity.Airline;

import java.util.ArrayList;

public class AirlineLogic {
    public ArrayList<Integer> findFlightByDestination(ArrayList<Airline> airlines, String finalDestination) {
        ArrayList<Integer> numbersOfFlights = new ArrayList<>();
        for (int i = 0; i < airlines.size()-1; i++) {
            if (airlines.get(i).getFinalDestination().equals(finalDestination)) {
                numbersOfFlights.add(airlines.get(i).getFlightNumber());
            }
        }
        return numbersOfFlights;
    }
    public ArrayList<Integer> findFlightByDay(ArrayList<Airline> airlines, String day) {
        ArrayList<Integer> numbersOfFlights = new ArrayList<>();
        for (int i = 0; i < airlines.size()-1; i++) {
            for (int j = 0; j < airlines.get(i).getDays().size(); j++) {
                if (airlines.get(i).getDays().get(j).equals(day)) {

                }numbersOfFlights.add(airlines.get(i).getFlightNumber());
            }
        }
        return numbersOfFlights;
    }
    public ArrayList<Integer> findFlightByDayAndTime(ArrayList<Airline> airlines, String day, int hour, int min) {
        ArrayList<Integer> numbersOfFlights = new ArrayList<>();
        for (int i = 0; i < airlines.size()-1; i++) {
            for (int j = 0; j < airlines.get(i).getDays().size(); j++) {
                if (airlines.get(i).getDays().get(j).equals(day)) {
                    if (airlines.get(i).getDepartureTimeHour() > hour) {
                        numbersOfFlights.add(airlines.get(i).getFlightNumber());
                    }
                    if (airlines.get(i).getDepartureTimeHour() == hour) {
                        if (airlines.get(i).getDepartureTimeMin() > min) {
                            numbersOfFlights.add(airlines.get(i).getFlightNumber());
                        }
                    }
                }
            }
        }
        return numbersOfFlights;
    }
}
