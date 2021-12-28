package sentences;


import nouns.Floor;
import nouns.Hall;
import nouns.Hole;
import nouns.Roof;
import persons.He;
import service_classes.Sml_wrds;

public class Fourth_sentence extends Sentence{

    He he = new He("Он");
    Hole hole = new Hole();
    Roof roof = new Roof();
    Floor floor = new Floor();
    Hall hall = new Hall();

    @Override
    public String getSentence() {
        StringBuilder s = new StringBuilder();
        s.append(he).append(he.watch()).append(hole).append(Sml_wrds.IN.getWrd()).append(roof);
        s.append(Sml_wrds.AND.getWrd()).append(floor).append(Sml_wrds.IN.getWrd()).append(hall).append(Sml_wrds.DOT.getWrd());
        return String.valueOf(s);
    }
    @Override
    public String toString(){
        return getSentence();
    }
}
