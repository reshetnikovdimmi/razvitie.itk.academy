package ru.example.stringBuilder;

public class CreatorStringBuilder {

    private StringBuilder currentText;

    public CreatorStringBuilder() {
        this.currentText = new StringBuilder();
    }

    public StringBuilder currentText() {
        return currentText;
    }

    //save() позволяет нам создать объект.

    public KeeperStringBuilder save() {
        return new KeeperStringBuilder(currentText.toString());
    }

    //restore() использует его для восстановления предыдущего состояния.

    public void restore(KeeperStringBuilder save) {
        currentText = new StringBuilder(save.getText());
    }
}
