package sentences;

import nouns.AllThis;
import nouns.Theater;
import persons.Freken;
import persons.Mumys;
import service_classes.CheckedException;
import service_classes.Sml_wrds;
import service_classes.UncheckedException;

public class One_sentence extends Sentence{

    AllThis allThis = new AllThis();
    Freken freken = new Freken(" фрекен Снорк");
    Mumys mumys = new Mumys();
    Mumys.Troll troll= mumys.new Troll();
    Theater theater = new Theater();
    Theater.Board board = new Theater.Board();

    @Override
    public String getSentence() {
        StringBuilder s = new StringBuilder();
        s.append(allThis.whle()).append(allThis.getText()).append(allThis.happened()).append(Sml_wrds.WITH.getWrd());
        s.append(troll).append(Sml_wrds.AND.getWrd()).append(freken).append(Sml_wrds.COMMA.getWrd());
        s.append(board).append(theater).append(Sml_wrds.DOT.getWrd());
        return String.valueOf(s);

    }
    @Override
    public String toString(){
        return getSentence();
    }
    public void cheking(One_sentence sentence) throws CheckedException{
        if ((String.valueOf(sentence).contains(".") == false)) throw new CheckedException("Ой! Первое предложение без точки!");
    }
    public void uncheking(One_sentence sentence) throws UncheckedException{
        if (String.valueOf(sentence).contains(("@"))) throw new UncheckedException("Какие-то страхи!");
    }


}
