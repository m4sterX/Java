package by.nkt.agreg.entity;

import java.util.Objects;

public class Word {

    private String substance;

    public Word(String substance) {
        this.substance = substance;
    }

    public Word() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return Objects.equals(substance, word.substance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(substance);
    }

    public String getSubstance() {
        return substance;
    }

    public void setSubstance(String substance) {
        this.substance = substance;
    }
}
