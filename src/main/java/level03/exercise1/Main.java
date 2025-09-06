package level03.exercise1;

import level03.exercise1.model.CreditCardPayment;
import level03.exercise1.model.DebitCardPayment;
import level03.exercise1.model.PaypalPayment;

public class Main {

    public static void main(String[] args) {

        ShoeStore shoeStore = new ShoeStore();

        shoeStore.paymentGateAway(new CreditCardPayment());
        shoeStore.paymentGateAway(new PaypalPayment());
        shoeStore.paymentGateAway(new DebitCardPayment());

    }
}
