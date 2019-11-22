package by.java.nkt.main;

import by.java.nkt.logic.DepotLogic;
import by.java.nkt.train.Depot;
import by.java.nkt.train.Train;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Depot depot1 = new Depot();

        Train train1 = new Train("Куропаты",1,13,45);
        Train train2 = new Train("Дружный",2,12,45);
        Train train3 = new Train("Ленина",3,16,50);
        Train train4 = new Train("Курган",4,18,13);
        Train train5 = new Train("Дружный",5,13,15);

        List<Train> trains = new ArrayList<>();
        trains.add(train1);
        trains.add(train2);
        trains.add(train3);
        trains.add(train4);
        trains.add(train5);







    }
}
