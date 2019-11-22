package by.java.nkt.main;

import java.util.ArrayList;

public class Print {
    public static void printArrayList(ArrayList<Object> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
