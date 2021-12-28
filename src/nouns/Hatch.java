package nouns;

import service_classes.Word_text;

public class Hatch implements Word_text {
    public String getText() {
        return "люк под ковром";
    }

    public String hehatch() {return "Он" + " ";}

    public String lead() {return  "вел прямо" + " ";}

    @Override
    public String toString(){
        return " " + getText();
    }
}
