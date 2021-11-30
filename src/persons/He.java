package persons;


public class He extends Person{
    public He(String name) {
        super(name);
    }

    public String try_imgn(){
        return "попытался представить ";
    }
    public String watch(){
        return "осмотрел";
    }
    public String found() {
        return "обнаружил";
    }
    public String was() { return "был" + " ";}
    public String very() { return "необычайно заинтригован";}

    @Override
    public String toString(){
        return getName() + " ";
    }

    @Override
    public boolean equals(He s) {
        if (s == this) {
            return true;
        }
        if (s == null || s.getName() != this.getName()) {
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(getName());
    }

}
