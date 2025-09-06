package level01.exercise1;

import level01.exercise1.app.PizzaMaster;
import level01.exercise1.model.PizzaBBQBuilder;
import level01.exercise1.model.PizzaCarboBuilder;

public class Main {
    public static void main(String[] args) {

        PizzaMaster pizzaMaster = new PizzaMaster();

        PizzaCarboBuilder carboBuilder = new PizzaCarboBuilder();
        pizzaMaster.buildPizzaCarbo(carboBuilder);

        System.out.println(carboBuilder.build());


        PizzaBBQBuilder BBQBuilder = new PizzaBBQBuilder();
        pizzaMaster.buildPizzaBBQ(BBQBuilder);

        System.out.println(BBQBuilder.build());

    }
}
