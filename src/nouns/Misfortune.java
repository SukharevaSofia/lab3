package nouns;

import ιnterfaces_and_enums.Word_text;

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
