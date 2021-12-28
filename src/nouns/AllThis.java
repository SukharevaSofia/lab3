package nouns;

import service_classes.Word_text;

public class AllThis implements Word_text {
    public String getText() {
        return "всё это";
    }

    public String whle(){ return "Пока ";}
    public String happened() { return " происходило ";}
    @Override
    public String toString(){
        return getText() + " ";
    }
}