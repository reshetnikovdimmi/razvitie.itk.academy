package ru.example.stringBuilder;

import java.util.LinkedList;
import java.util.Stack;

public class CreatorStringBuilder {

    private static final int MAX_HISTORY_SIZE = 100;
    private final Stack<KeeperStringBuilder> history = new Stack<>();

    //save() позволяет нам создать стек объектов.

    public void save(String currentText) {
        if (history.size() == MAX_HISTORY_SIZE) history.removeLast();
        history.addFirst(new KeeperStringBuilder(currentText));
    }

    //restore() использует его для восстановления предыдущего состояния.

    public KeeperStringBuilder restore() {
        if (!history.isEmpty()) history.removeFirst();
        return history.isEmpty() ? null : history.getFirst();
    }
    //вся история
    public Stack<KeeperStringBuilder> allHistory() {
        return history.isEmpty() ? null : history;
    }


}

