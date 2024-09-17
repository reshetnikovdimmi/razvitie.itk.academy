package ru.example.stringBuilder;

public class MyStringBuilder {

    private final CreatorStringBuilder creatorStringBuilder = new CreatorStringBuilder();


    public String append(String text) {
        if (creatorStringBuilder.allHistory()==null){
            creatorStringBuilder.save(text);
        }else{
            creatorStringBuilder.save(creatorStringBuilder.allHistory().getFirst().getText() + text);
        }
       return creatorStringBuilder.allHistory().getFirst().getText();
    }


    public String undo() {
      return  creatorStringBuilder.restore().getText();
    }


}
