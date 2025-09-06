package level01.exercise1.model;

import java.util.List;

public class PizzaBBQ {

    private final String size;
    private final String dough;
    private final List<Topping> toppings;

    PizzaBBQ(String size, String dough, List<Topping> toppings) {
        this.size = size;
        this.dough = dough;
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return """
                PizzaBBQ {
                    size=%s,
                    dough=%s,
                    toppings=%s
                }""".formatted(size, dough, toppings);
    }

}
