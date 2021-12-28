package sentences;

import nouns.Coda;
import nouns.Hatch;
import service_classes.Sml_wrds;

public class Sixth_sentence extends Sentence{

    Hatch hatch = new Hatch();
    Coda coda = new Coda();
    @Override
    public String getSentence() {
        StringBuilder s = new StringBuilder();
        s.append(hatch.hehatch()).append(hatch.lead()).append(Sml_wrds.IN.getWrd()).append(coda.black());
        s.append(coda).append(coda.underHouse()).append(Sml_wrds.DOT.getWrd());
        return String.valueOf(s);
    }
    @Override
    public String toString(){
        return getSentence();
    }
}
