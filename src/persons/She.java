package persons;

public class She extends Person{

    public She(String name) {
        super(name);
    }
    public String getSat(){
        return "уселась" + " ";
    }
    public String cryHard(){
        return " горько плакала";
    }

    @Override
    public String toString(){
        return getName() + " ";
    }
}
