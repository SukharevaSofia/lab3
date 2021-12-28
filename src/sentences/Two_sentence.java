package sentences;

import persons.Mumys;
import service_classes.Sml_wrds;

public class Two_sentence extends Sentence{

    Mumys mumys = new Mumys();
    Mumys.Mom mom = mumys.new Mom();

    @Override
    public String getSentence() {
        StringBuilder s = new StringBuilder();
        s.append(mom).append(mom.touch()).append(Sml_wrds.DOT.getWrd());
        return String.valueOf(s);

    }
    @Override
    public String toString(){
        return getSentence();
    }
}
