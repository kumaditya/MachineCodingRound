package in.sp.goodDesign;

public class UPIPaymentMethod implements PaymentMethod {
    @Override
    public void pay(Double amount) {

        System.out.println("Payment Processed Successfully by UPI Payment Method");
    }
}
