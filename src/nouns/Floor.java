package nouns;

import service_classes.Word_text;

public class Floor implements Word_text {
    public String getText() {
        return "весь пол";
    }

    @Override
    public String toString(){
        return " " + getText() + " ";
    }
}
