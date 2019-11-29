package by.nkt.agreg.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sentence {
    private List<Word> substance = new ArrayList<>();

    public Sentence(List<Word> substance) {
        this.substance = substance;
    }
    public Sentence() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentence sentence = (Sentence) o;
        return Objects.equals(substance, sentence.substance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(substance);
    }


    public List<Word> getSubstance() {
        return substance;
    }

    public void setSubstance(List<Word> substance) {
        this.substance = substance;
    }


}
