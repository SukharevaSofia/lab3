package nouns;

import ιnterfaces_and_enums.Word_text;

public class Only_thing implements Word_text {
    public String getText() {
        return "Единственное";
    }

    @Override
    public String toString(){
        return getText();
    }
}
