package nouns;

import ιnterfaces_and_enums.Word_text;

public class Hall implements Word_text {
    public String getText() {
        return "зале";
    }

    @Override
    public String toString(){
        return " " + getText();
    }
}
