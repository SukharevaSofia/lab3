package sentences;

public class One_sentence extends Sentence{


    @Override
    public String getSentence() {
        StringBuilder s = new StringBuilder();
        //s.append();
        return String.valueOf(s);
    }
    @Override
    public String toString(){
        return getSentence();
    }
}
