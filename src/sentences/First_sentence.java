package sentences;

import nouns.Mouring;
import persons.Misa;
import ιnterfaces_and_enums.Sml_wrds;

public class First_sentence extends Sentence{
    Misa misa = new Misa("Миса");
    Mouring mouring = new Mouring();

    @Override
    public String getSentence() {
        StringBuilder s = new StringBuilder();
        s.append(misa).append(" ").append(Sml_wrds.IN.getWrd()).append(" ").append(mouring).append(Sml_wrds.DOT.getWrd());
        return String.valueOf(s);
    }

    @Override
    public String toString(){
        return getSentence();
    }
}
