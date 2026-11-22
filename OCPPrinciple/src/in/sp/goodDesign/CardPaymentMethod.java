package in.sp.goodDesign;

public class CardPaymentMethod implements PaymentMethod{
    @Override
    public void pay(Double amount) {
        System.out.println("Payment processed by Card Payment");
    }
}
