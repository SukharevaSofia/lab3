package nouns;

import ιnterfaces_and_enums.Word_text;

public class Corner implements Word_text {

    public String getText() {
        return "угол";
    }

    @Override
    public String toString(){
        return " " + getText() + " ";
    }
}
