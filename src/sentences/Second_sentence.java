package sentences;

import nouns.Corner;
import persons.She;
import service_classes.Sml_wrds;

public class Second_sentence extends Sentence{
    She she = new She("Она");
    Corner corner = new Corner();

    @Override
    public String getSentence() {
        StringBuilder s = new StringBuilder();
        s = s.append(she).append(she.getSat()).append(Sml_wrds.IN.getWrd()).append(corner);
        s = s.append(Sml_wrds.AND.getWrd()).append(she.cryHard()).append(Sml_wrds.DOT.getWrd());
        return String.valueOf(s);
    }
    @Override
    public String toString(){
        return getSentence();
    }
}
