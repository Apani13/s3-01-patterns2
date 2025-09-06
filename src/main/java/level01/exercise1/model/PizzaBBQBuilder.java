package level01.exercise1.model;

import level01.exercise1.builder.PizzaBuilder;

import java.util.List;

public class PizzaBBQBuilder implements PizzaBuilder {

    private String size;
    private String dough;
    private List<Topping> toppings;

    @Override
    public PizzaBuilder size(String size) {
        this.size = size;
        return this;
    }

    @Override
    public PizzaBuilder dough(String dough) {
        this.dough = dough;
        return this;
    }

    @Override
    public PizzaBuilder toppings(List<Topping> toppings) {
        this.toppings = toppings;
        return this;
    }

    public PizzaBBQ build() {
        return new PizzaBBQ(size, dough, toppings);
    }
}
