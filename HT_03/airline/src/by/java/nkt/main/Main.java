package by.java.nkt.main;

import by.java.nkt.entity.Airline;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        String[] arrOfDays = new String[]{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        ArrayList<String> days1 = new ArrayList<>();
        days1.add(arrOfDays[2]);
        days1.add(arrOfDays[5]);

        ArrayList<String> days2 = new ArrayList<>();
        days2.add(arrOfDays[3]);
        days2.add(arrOfDays[5]);

        ArrayList<String> days3 = new ArrayList<>();
        days3.add(arrOfDays[2]);
        days3.add(arrOfDays[6]);

        Airline airline1 = new Airline("Egypt",101 ,"medium",5,13,days1);

        Airline airline2 = new Airline("Egypt",102 ,"big",10,22,days2);

        Airline airline3 = new Airline("Tokyo",103 ,"big",5,18,days3);

    }
}
