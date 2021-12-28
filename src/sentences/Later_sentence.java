package sentences;

import persons.Myu;
import service_classes.Sml_wrds;

public class Later_sentence extends Sentence{

    Myu myu = new Myu("малышка Мью ");

    @Override
    public String getSentence() {
        StringBuilder s = new StringBuilder();
        s.append(Sml_wrds.ONLY.getWrd()).append(myu.getName()).append(myu).append(Sml_wrds.DOT.getWrd());
        return String.valueOf(s);

    }
    @Override
    public String toString(){
        return getSentence();
    }
}
