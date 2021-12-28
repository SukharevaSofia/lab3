package sentences;

import nouns.NoOne;
import service_classes.Sml_wrds;

public class Last_sentence extends Sentence{

    NoOne noOne = new NoOne();
    @Override
    public String getSentence() {
        StringBuilder s = new StringBuilder();
        s.append(Sml_wrds.BUT.getWrd()).append(noOne).append(Sml_wrds.DOT.getWrd());
        return String.valueOf(s);

    }
    @Override
    public String toString(){
        return getSentence();
    }
}

