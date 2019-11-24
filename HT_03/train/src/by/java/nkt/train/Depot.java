package by.java.nkt.train;

import by.java.nkt.logic.DepotLogic;

import java.util.List;
import java.util.Objects;

public class Depot {
     private List<Train> trains;

    public Depot() {
    }
    public Depot(List<Train> trains) {
        this.trains = trains;
    }

    public List<Train> getTrains() {
        return trains;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Depot depot = (Depot) o;
        return trains.equals(depot.trains);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trains);
    }

    public void setTrains(List<Train> trains) {
        this.trains = trains;
    }

}