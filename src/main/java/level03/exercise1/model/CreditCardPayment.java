package level03.exercise1.model;

public class CreditCardPayment implements PaymentMethodCallBack {

    @Override
    public void pay() {
        System.out.println("paying with credit card...");
    }
}
