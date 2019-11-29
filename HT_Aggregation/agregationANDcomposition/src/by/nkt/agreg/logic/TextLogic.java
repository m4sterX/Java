package by.nkt.agreg.logic;

import by.nkt.agreg.entity.Sentence;
import by.nkt.agreg.entity.Text;

import java.util.List;

public class TextLogic {

    public static Text addSentenceToText (Text text, List<Sentence> sentences) {

        List<Sentence> listSentences = text.getSubstance(); // получаю предложения текста
        listSentences.addAll(sentences); // Добавляю предложения к тексту
        Text newText = new Text(); // создаю новый текст
        newText.setSubstance(listSentences); // собираю новый текст

        return newText;
    }

}
