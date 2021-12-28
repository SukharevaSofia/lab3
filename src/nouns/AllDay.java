package nouns;

import service_classes.Word_text;

public class AllDay implements Word_text {

    public String getText() {return "Весь день ";}

    @Override
    public String toString(){
        return getText();
    }
}
