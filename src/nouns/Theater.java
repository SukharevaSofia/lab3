package nouns;

import service_classes.Word_text;

public class Theater implements Word_text {

    public String getText() {
        return "плавучего театра ";
    }

    @Override
    public String toString(){
        return getText() + "наступило печальное утро";
    }

    public static class Board {
        private String getText() {return "на борту ";}

        @Override
        public String toString(){
            return getText();
        }
    }

}
