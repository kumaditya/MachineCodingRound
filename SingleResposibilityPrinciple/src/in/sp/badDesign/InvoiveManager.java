package in.sp.badDesign;

public class InvoiveManager {
    public double calculateTotal(double price) {
        double tax = price * 0.18;
        return price + tax;
    }

    public void saveInvoice(double total) {
        System.out.println("Saving invoice to MySQL with total: " +
                total);
    }

    public void sendInvoiceEmail(double total, String email) {

        System.out.println("Sending invoice of " + total
                + " to " + email);
    }
}
