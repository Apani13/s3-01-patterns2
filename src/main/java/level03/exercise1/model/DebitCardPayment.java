package level03.exercise1.model;

public class DebitCardPayment implements PaymentMethodCallBack {

    @Override
    public void pay() {
        System.out.println("paying with debit card...");
    }
}
