package persons;

public class She extends Person{

    public She(String name) {
        super(name);
    }

    @Override
    public boolean equals(He s) {
        return false;
    }

    public String getSat(){
        return "уселась" + " ";
    }
    public String cryHard(){return " горько плакала";}
    public String repeat(){return " беспрестанно повторяла";}
    public String sitting(){return "Сидя в качалке";}
    @Override
    public String toString(){
        return getName() + " ";
    }
}
