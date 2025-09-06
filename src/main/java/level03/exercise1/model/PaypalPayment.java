package level03.exercise1.model;

public class PaypalPayment implements PaymentMethodCallBack {

    @Override
    public void pay() {
        System.out.println("paying with paypal...");
    }
}