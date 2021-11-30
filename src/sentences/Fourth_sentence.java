package sentences;


import persons.He;

public class Fourth_sentence extends Sentence{

    He he = new He("Он");
    @Override
    public String getSentence() {
        StringBuilder s = new StringBuilder();
        s = s.append(he).append(he.watch()).append("");
        return String.valueOf(s);
    }
    @Override
    public String toString(){
        return getSentence();
    }
}
