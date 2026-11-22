import in.sp.goodDesign.CardPaymentMethod;
import in.sp.goodDesign.PaymentMethod;
import in.sp.goodDesign.PaymentProcessor;
import in.sp.goodDesign.UPIPaymentMethod;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        // Dummy UPI Payment Method object and dummy data
        PaymentMethod upiPayment = new UPIPaymentMethod();
        Double upiAmount = 1500.00;
        paymentProcessor.pay(upiPayment, upiAmount);

        // Dummy Card Payment Method object and dummy data
        PaymentMethod cardPayment = new CardPaymentMethod();
        Double cardAmount = 2500.00;
        paymentProcessor.pay(cardPayment, cardAmount);
    }
}
