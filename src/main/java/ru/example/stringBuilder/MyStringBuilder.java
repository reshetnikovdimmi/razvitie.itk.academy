package ru.example.stringBuilder;

public class MyStringBuilder {

    private final CreatorStringBuilder creatorStringBuilder = new CreatorStringBuilder();
    private KeeperStringBuilder savedTextWindow;

    //этот метод сохраняет последнее изменение
    private void hitSave() {
        savedTextWindow = creatorStringBuilder.save();
    }
    //этот метод возвращает строку, представляющую данные в этой последовательности.
    public String toString() {
        return creatorStringBuilder.currentText().toString();
    }
    //этот метод отменяет последнее изменение;
    public void undo() {
        creatorStringBuilder.restore(savedTextWindow);
    }

    //этот метод добавляет строковое представление аргумента типа X к последовательности.
    public void append(String s) {
        hitSave();
        creatorStringBuilder.currentText().append(s);
    }

    //этот метод добавляет строковое представление аргумента codePoint к этой последовательности.
    void appendCodePoint(int codePoint) {
        hitSave();
        creatorStringBuilder.currentText().appendCodePoint(codePoint);
    }

    //этот метод возвращает текущую емкость.
    int capacity() {

       return creatorStringBuilder.currentText().capacity();
    }

    //этот метод возвращает значение char в данной последовательности по указанному индексу.
    char charAt(int index) {
       return creatorStringBuilder.currentText().charAt(index);
    }

    //  этот метод удаляет символы в подстроке данной последовательности.
    void delete(int start, int end) {
        hitSave();
        creatorStringBuilder.currentText().delete(start, end);
    }

    // этот метод удаляет символ в указанной позиции в этой последовательности.
    void deleteCharAt(int index) {
        hitSave();
        creatorStringBuilder.currentText().deleteCharAt(index);
    }

    //этот метод заменяет данную последовательность символов на
    void reverse(){
        creatorStringBuilder.currentText().reverse();
    }

}
