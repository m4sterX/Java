package by.nkt.agreg.view;

import by.nkt.agreg.entity.Sentence;
import by.nkt.agreg.entity.Text;
import by.nkt.agreg.entity.Word;

import java.util.List;

public class Print {
    public static void printText(Text text) {
        List<Sentence> sentences = text.getSubstance();
        for (Sentence i : sentences
        ) {
            System.out.println();
            List<Word> words = i.getSubstance();
            for (Word j : words
            ) {
                System.out.println(j);
            }
        }
    }
}
