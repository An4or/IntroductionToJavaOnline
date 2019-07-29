package by.yakovtsev.introduction.programming_with_classes_4.aggregation_composition.task1;

public class Phrase {
    private String value="";

    public void addValue(Word word) {
        value += " " + word.getValue();
    }

    public String getValue() {
        return value;
    }
}
