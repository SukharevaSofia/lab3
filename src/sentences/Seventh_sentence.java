package sentences;

import persons.He;
import service_classes.Sml_wrds;

public class Seventh_sentence extends Sentence{

    He he = new He("Хомса");

    @Override
    public String getSentence() {
        StringBuilder s = new StringBuilder();
        s.append(he).append(he.was()).append(he.very()).append(Sml_wrds.DOT.getWrd());
        return String.valueOf(s);
    }
    @Override
    public String toString(){
        return getSentence();
    }
}
