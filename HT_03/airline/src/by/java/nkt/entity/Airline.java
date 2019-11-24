package by.java.nkt.entity;

import java.util.ArrayList;
import java.util.Objects;

public class Airline {
    private String finalDestination;
    private int flightNumber;
    private String typeOfPlane;
    private int departureTimeMin;
    private int departureTimeHour;
    private ArrayList<String> days;

    public String getFinalDestination() {
        return finalDestination;
    }

    public void setFinalDestination(String finalDestination) {
        this.finalDestination = finalDestination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getTypeOfPlane() {
        return typeOfPlane;
    }

    public Airline() {
    }

    public Airline(String finalDestination, int flightNumber, String typeOfPlane, int departureTimeMin, int departureTimeHour, ArrayList<String> days) {
        this.finalDestination = finalDestination;
        this.flightNumber = flightNumber;
        this.typeOfPlane = typeOfPlane;
        this.departureTimeMin = departureTimeMin;
        this.departureTimeHour = departureTimeHour;
        this.days = days;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "finalDestination='" + finalDestination + '\'' +
                ", flightNumber=" + flightNumber +
                ", typeOfPlane='" + typeOfPlane + '\'' +
                ", departureTimeMin=" + departureTimeMin +
                ", departureTimeHour=" + departureTimeHour +
                ", days=" + days +
                '}';
    }





    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return flightNumber == airline.flightNumber &&
                departureTimeMin == airline.departureTimeMin &&
                departureTimeHour == airline.departureTimeHour &&
                Objects.equals(finalDestination, airline.finalDestination) &&
                Objects.equals(typeOfPlane, airline.typeOfPlane) &&
                Objects.equals(days, airline.days);
    }

    @Override
    public int hashCode() {
        return Objects.hash(finalDestination, flightNumber, typeOfPlane, departureTimeMin, departureTimeHour, days);
    }

    public void setTypeOfPlane(String typeOfPlane) {
        this.typeOfPlane = typeOfPlane;
    }

    public int getDepartureTimeMin() {
        return departureTimeMin;
    }

    public void setDepartureTimeMin(int departureTimeMin) {
        this.departureTimeMin = departureTimeMin;
    }

    public int getDepartureTimeHour() {
        return departureTimeHour;
    }

    public void setDepartureTimeHour(int departureTimeHour) {
        this.departureTimeHour = departureTimeHour;
    }

    public ArrayList<String> getDays() {
        return days;
    }

    public void setDays(ArrayList<String> days) {
        this.days = days;
    }
}
