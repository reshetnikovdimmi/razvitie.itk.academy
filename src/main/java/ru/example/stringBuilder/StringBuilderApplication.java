package ru.example.stringBuilder;

public class StringBuilderApplication {
    public static void main(String[] args) {

        MyStringBuilder textEditor = new MyStringBuilder();

        System.out.println(textEditor.append("Hello world!"));
        System.out.println(textEditor.append("Hello world!"));
        System.out.println(textEditor.append("Hello world!"));
        System.out.println(textEditor.undo());
    }
}
