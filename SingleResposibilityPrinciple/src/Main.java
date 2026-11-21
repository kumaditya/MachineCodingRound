import in.sp.goodDesign.InvoiceService;
import in.sp.goodDesign.Invoive;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Invoive invoice = new Invoive(new BigDecimal("1000.00"), "customer@example.com");
        InvoiceService invoiceService = new InvoiceService();
        invoiceService.issueInvoice(invoice);
    }
}
