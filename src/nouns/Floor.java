package nouns;

import ιnterfaces_and_enums.Word_text;

public class Floor implements Word_text {
    public String getText() {
        return "весь пол";
    }

    @Override
    public String toString(){
        return " " + getText() + " ";
    }
}
