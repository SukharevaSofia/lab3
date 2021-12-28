package sentences;

import nouns.AllDay;
import persons.Myu;
import persons.She;
import service_classes.Sml_wrds;

public class Lastest_sentence extends Sentence{

    Myu myu = new Myu("мяяяу");
    AllDay allDay = new AllDay();
    She she = new She("она"){
        @Override
        public String toString(){
            return getName() + " пролежала здесь";
        }

    };

    @Override
    public String getSentence() {
        StringBuilder s = new StringBuilder();
        s.append(allDay).append(she).append(Sml_wrds.COMMA.getWrd()).append(myu.hope()).append(Sml_wrds.COMMA.getWrd());
        s.append(Sml_wrds.SMALL_BUT.getWrd()).append(Sml_wrds.COMMA.getWrd()).append("к сожалению");
        s.append(Sml_wrds.COMMA.getWrd()).append(myu.notsee()).append(Sml_wrds.DOT.getWrd());
        return String.valueOf(s);

    }
    @Override
    public String toString(){
        return getSentence();
    }
}
