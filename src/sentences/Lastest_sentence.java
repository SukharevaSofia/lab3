package sentences;

import nouns.AllDay;

public class Lastest_sentence extends Sentence{

    AllDay allDay = new AllDay();

    @Override
    public String getSentence() {
        StringBuilder s = new StringBuilder();
        s.append(allDay);
        return String.valueOf(s);

    }
    @Override
    public String toString(){
        return getSentence();
    }
}
