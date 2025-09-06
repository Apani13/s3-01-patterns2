package level01.exercise1.model;

public class Topping {

    private String name;

    public Topping(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return name;
    }
}
