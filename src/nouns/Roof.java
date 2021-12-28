package nouns;

import service_classes.Word_text;

public class Roof implements Word_text {
    public String getText() {
        return "крыше чулана";
    }

    @Override
    public String toString(){
        return " " + getText() + " ";
    }
}
