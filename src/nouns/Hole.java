package nouns;

import service_classes.Word_text;

public class Hole implements Word_text {
    public String getText() {
        return "ะดััั";
    }

    @Override
    public String toString(){
        return " " + getText() + " ";
    }
}
