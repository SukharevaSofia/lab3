package nouns;

import service_classes.Word_text;

public class Mouring implements Word_text {

    public String getText() {
        return "траур";
    }

    @Override
    public String toString(){
        return getText();
    }
}
