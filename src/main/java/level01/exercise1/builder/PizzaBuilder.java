package level01.exercise1.builder;

import level01.exercise1.model.Topping;

import java.util.List;

public interface PizzaBuilder {

    PizzaBuilder size(String size);

    PizzaBuilder dough(String dough);

    PizzaBuilder toppings(List<Topping> toppings);

}
