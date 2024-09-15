package ru.example.stringBuilder;


//Memento(snapshot)
public class KeeperStringBuilder {

    private String text;

    public KeeperStringBuilder(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
