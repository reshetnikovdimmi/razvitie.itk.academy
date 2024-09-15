package ru.example.stringBuilder;

public class StringBuilderApplication {
    public static void main(String[] args) {

        MyStringBuilder textEditor = new MyStringBuilder();

        textEditor.append("Hello world!");
        System.out.println("-->"+" "+ textEditor);

        textEditor.append("Hello world");
        System.out.println("-->"+" "+ textEditor);

        textEditor.undo();
        System.out.println("-->"+" "+ textEditor);

        textEditor.appendCodePoint(3);
        System.out.println("-->"+" "+ textEditor);

        textEditor.undo();
        System.out.println("-->"+" "+ textEditor);

        System.out.println(textEditor.charAt(0));

        System.out.println("-->"+" "+ textEditor.capacity());

        textEditor.deleteCharAt(0);
        System.out.println("-->"+" "+ textEditor);

        textEditor.undo();
        System.out.println("-->"+" "+ textEditor);

        textEditor.delete(2,3);
        System.out.println("-->"+" "+ textEditor);

        textEditor.undo();
        System.out.println("-->"+" "+ textEditor);

        textEditor.reverse();
        System.out.println("-->"+" "+ textEditor);

        textEditor.undo();
        System.out.println("-->"+" "+ textEditor);
    }
}
