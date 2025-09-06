package level01.exercise1.app;

import level01.exercise1.builder.PizzaBuilder;
import level01.exercise1.model.Topping;

import java.util.List;


public class PizzaMaster {

    public void buildPizzaCarbo(PizzaBuilder pizzaBuilder) {
        pizzaBuilder.size("Small")
                .dough("American style")
                .toppings(List.of(
                        new Topping("Bacon"),
                        new Topping("Champs"),
                        new Topping("Onion"),
                        new Topping("Black Olives")
                ));
    }

    public void buildPizzaBBQ(PizzaBuilder pizzaBuilder) {
        pizzaBuilder.size("Familiar")
                .dough("italian style")
                .toppings(List.of(
                        new Topping("Minced beef"),
                        new Topping("Minced pork"),
                        new Topping("Onion"),
                        new Topping("Extra BBQ sauce")
                ));
    }
}
