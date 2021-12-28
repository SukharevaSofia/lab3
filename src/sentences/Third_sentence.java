package sentences;


import nouns.Misfortune;
import persons.He;
import service_classes.Sml_wrds;

public class Third_sentence extends Sentence{
    He he = new He("Он");
    Misfortune misfortune = new Misfortune();
    @Override
    public String getSentence() {
        StringBuilder s = new StringBuilder();
        s = s.append(he).append(he.try_imgn()).append(Sml_wrds.WHOM.getWrd()).append(Sml_wrds.COMMA.getWrd());
        s = s.append(Sml_wrds.HOW.getWrd()).append(misfortune.happened()).append(misfortune).append(Sml_wrds.DOT.getWrd());
        return String.valueOf(s);
    }
    @Override
    public String toString(){
        return getSentence();
    }
}
