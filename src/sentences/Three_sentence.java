package sentences;

import nouns.Roof;
import persons.Mumys;
import persons.She;
import service_classes.Sml_wrds;

public class Three_sentence extends Sentence{

    She she = new She(" она");
    Mumys mumys = new Mumys();
    Mumys.Dad dad = mumys.new Dad();
    Roof roof = new Roof();

    @Override
    public String getSentence() {
        StringBuilder s = new StringBuilder();
        s.append(she.sitting()).append(she).append(she.repeat()).append(Sml_wrds.COLON.getWrd());
        s.append(dad).append(dad.sad()).append(Sml_wrds.AT.getWrd()).append(roof.proboin()).append(Sml_wrds.DOT.getWrd());
        return String.valueOf(s);

    }
    @Override
    public String toString(){
        return getSentence();
    }
}

