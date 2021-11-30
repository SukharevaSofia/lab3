package nouns;

import ιnterfaces_and_enums.Word_text;

public class Hole implements Word_text {
    public String getText() {
        return "дыру ";
    }

    @Override
    public String toString(){
        return " " + getText() + " ";
    }
}
