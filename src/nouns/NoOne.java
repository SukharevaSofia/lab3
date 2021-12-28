package nouns;

public class NoOne{
    public String one(){return " никто ";}
    class Attention{
        public String pay(){return "не обратил внимания";}
        public String invention(){return " на его открытие";}
    }

    Attention attention = new Attention();

    @Override
    public String toString(){return one() + attention.pay() + attention.invention();}
}
