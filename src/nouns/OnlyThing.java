package nouns;

import service_classes.Word_text;

public class OnlyThing implements Word_text {
    public String getText() {
        return "Единственное";
    }

    @Override
    public String toString(){
        return getText();
    }
}
