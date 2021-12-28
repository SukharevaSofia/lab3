package nouns;

import service_classes.Word_text;

public class Corner implements Word_text {

    public String getText() {
        return "угол";
    }

    @Override
    public String toString(){
        return " " + getText() + " ";
    }
}
