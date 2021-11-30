package persons;

public class He extends Person{
    public He(String name) {
        super(name);
    }

    public String try_imgn(){
        return "попытался представить ";
    }
    public String watch(){
        return  "осмотрел ";
    }
    public String found() {
        return "обнаружил";
    }

    @Override
    public String toString(){
        return getName() + " ";
    }
}
