package in.sp.goodDesign;

public class PaymentProcessor {

    public void pay(PaymentMethod p, Double amount) {
        p.pay(amount);
    }
}
