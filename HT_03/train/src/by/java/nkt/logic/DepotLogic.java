package by.java.nkt.logic;

import by.java.nkt.train.Depot;
import by.java.nkt.train.Train;

import java.util.Comparator;
import java.util.List;

public class DepotLogic {
    // СОРТИРОВКА ПО ОМЕРУ ПОЕЗДА
    public List<Train> sortByNumber(Depot depot) {
        List<Train> trains = depot.getTrains();
        trains.sort(Comparator.comparing(Train::getTrainNumber));
        return trains;
    }
    // ПОИСК ПО НОМЕРУ
    public Train findByNumber(Depot depot, int n) {
        List<Train> trains = depot.getTrains();
        for (int i = 0; i < trains.size(); i++) {
            if (trains.get(i).getTrainNumber() == n){
                return trains.get(i);
            }
        }
        return null;
    }
    // СОРТИРОВКА ПО ПУНКТУ НАЗНАЧЕНИЯ И ВРЕМЕНИ
    public List<Train> sortByDestination(Depot depot) {
        List<Train> trains = depot.getTrains();
        boolean isSorted = false;
        String buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < trains.size()-1; i++) {
                if(trains.get(i).getDestination().compareTo(trains.get(i+1).getDestination()) > 0){
                    isSorted = false;

                    buf = trains.get(i).getDestination();
                    trains.get(i).setDestination(trains.get(i+1).getDestination());
                    trains.get(i+1).setDestination(buf);
                }
                if (trains.get(i).getDestination().compareTo(trains.get(i+1).getDestination()) == 0) {
                    if (trains.get(i).getArriveTimeHour() > trains.get(i+1).getArriveTimeHour()) {
                        int tmp = trains.get(i).getArriveTimeHour();
                        trains.get(i).setArriveTimeHour(trains.get(i+1).getArriveTimeHour());
                        trains.get(i+1).setArriveTimeHour(tmp);
                    } else if (trains.get(i).getArriveTimeHour() == trains.get(i+1).getArriveTimeHour()) {
                        if (trains.get(i).getArriveTimeMin() > trains.get(i+1).getArriveTimeMin()) {
                            int temp = trains.get(i).getArriveTimeMin();
                            trains.get(i).setArriveTimeMin(trains.get(i+1).getArriveTimeMin());
                            trains.get(i+1).setArriveTimeMin(temp);
                        }
                    }
                }
            }
        }
        return trains;
    }

}
