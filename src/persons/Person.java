package persons;

abstract class Person{

    private final String name;

    public Person(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public abstract boolean equals(He s);
}
