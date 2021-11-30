package sentences;

import ιnterfaces_and_enums.Sentence_text;

abstract class Sentence implements Sentence_text {
    public String getSentence() {
        StringBuilder s = new StringBuilder();
        return String.valueOf(s);
    }

}
