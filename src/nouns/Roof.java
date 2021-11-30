package nouns;

import ιnterfaces_and_enums.Word_text;

public class Roof implements Word_text {
    public String getText() {
        return "крыше чулана";
    }

    @Override
    public String toString(){
        return " " + getText() + " ";
    }
}
