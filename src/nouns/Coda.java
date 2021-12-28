package nouns;

import service_classes.Word_text;

public class Coda implements Word_text {
    public String getText() {
        return "коду";
    }

    public String black(){ return " " + "чёрную клокочущую" + " ";}
    public String underHouse() { return "под домом";}
    @Override
    public String toString(){
        return getText() + " ";
    }
}
