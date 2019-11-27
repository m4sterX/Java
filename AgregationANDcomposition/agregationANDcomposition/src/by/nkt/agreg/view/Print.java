package by.nkt.agreg.view;

import by.nkt.agreg.entity.City;
import by.nkt.agreg.entity.Sentence;
import by.nkt.agreg.entity.Text;
import by.nkt.agreg.entity.Word;

import java.util.List;

public class Print {
    public static void printText(Text text) {
        List<Sentence> sentences = text.getSubstance();
        for (Sentence i: sentences
             ) {
            System.out.println();
           List<Word> words = i.getSubstance();
            for (Word j: words
                 ) {
                System.out.println(j);
            }
        }
    }
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
