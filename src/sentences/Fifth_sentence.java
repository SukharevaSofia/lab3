package sentences;

import nouns.Hatch;
import nouns.OnlyThing;
import persons.He;
import service_classes.Sml_wrds;

public class Fifth_sentence extends Sentence{

    He he = new He("он");
    OnlyThing only_thing = new OnlyThing();
    Hatch hatch = new Hatch();
    @Override
    public String getSentence() {
        StringBuilder s = new StringBuilder();
        s.append(only_thing).append(Sml_wrds.COMMA.getWrd()).append(Sml_wrds.WHAT.getWrd()).append(" ");
        s.append(he).append(he.found()).append(Sml_wrds.COMMA.getWrd()).append(Sml_wrds.THIS.getWrd());
        s.append(hatch).append(Sml_wrds.DOT.getWrd());
        return String.valueOf(s);
    }
    @Override
    public String toString(){
        return getSentence();
    }
}
