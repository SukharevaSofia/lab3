package persons;

public class Misa extends Person {

    public Misa(String name) {
        super(name);
    }

    public String Dress_up(){
        return "оделась";
    }

    @Override
    public String toString(){
        return getName() + " " + Dress_up();
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        return false;
    }

}
