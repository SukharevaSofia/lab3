package persons;

public class Myu extends Person{
    public Myu(String name) {
        super(name);
    }

    public String lay(){return "легла на живот и ";}
    public String watch(){return "стала смотреть в воду";}
    public String hope(){return "надеясь увидеть негодяев";}
    public String notsee(){return "ни одного не увидела";}

    @Override
    public String toString(){return lay() + watch();}


    @Override
    public boolean equals(He s) {
        return false;
    }
}
