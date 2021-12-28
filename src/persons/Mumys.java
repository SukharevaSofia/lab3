package persons;

import service_classes.Word_text;

public class Mumys{

    public class Troll implements Word_text{
        public String getText() {
            return " Муми-троллем ";
        }
        public String toString(){
            return getText();
        }
    }

    public class Mom implements Word_text{
        public String getText(){return "Муми-мама";}
        public String touch(){return " не притрагивалась к еде";}
        public String toString(){
            return getText();
        }
    }

    public class Dad implements Word_text{
        public String getText(){return "Муми-папа ";}
        public String sad(){return "печально уставился ";}
        public String toString(){return getText();}
    }

}
