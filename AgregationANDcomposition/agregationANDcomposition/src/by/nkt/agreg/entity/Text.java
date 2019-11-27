package by.nkt.agreg.entity;
// 1. Создать объект класса Текст,
// используя классы Предложение, Слово.
// Методы:
// дополнить текст,
// вывести на консоль текст,
// заголовок текста.
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Text {

    private List<Sentence> substance = new ArrayList<>();
    private String title;
    public Text() {
    }

    public Text(List<Sentence> substance, String title) {
        this.substance = substance;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text = (Text) o;
        return Objects.equals(substance, text.substance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(substance);
    }

    public List<Sentence> getSubstance() {
        return substance;
    }

    public void setSubstance(List<Sentence> substance) {
        this.substance = substance;
    }
}
