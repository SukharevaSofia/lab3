package sentences;

import service_classes.CheckedException;

public class One_sentence extends Sentence{

    boolean isEmpty;
    @Override
    public String getSentence() {
        StringBuilder s = new StringBuilder();
        s.append(" .");
        return String.valueOf(s);

    }
    @Override
    public String toString(){
        return getSentence();
    }
    public void cheking(One_sentence sentence) throws CheckedException{
        if ((String.valueOf(sentence).contains(".") == false)) throw new CheckedException("Ой! Первое предложение без точки!");
    }


}