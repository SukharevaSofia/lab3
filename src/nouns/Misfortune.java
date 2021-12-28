package nouns;

import service_classes.Word_text;

public class Misfortune implements Word_text {

    public String getText() {
        return "несчастье";
    }

    public String happened(){ return " случилось ";}

    @Override
    public String toString(){
        return getText();
    }
}
