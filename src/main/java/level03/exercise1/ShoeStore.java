package level03.exercise1;

import level03.exercise1.model.PaymentMethodCallBack;

public class ShoeStore {

    final void paymentGateAway(PaymentMethodCallBack payment) {
        payment.pay();
    }

}
