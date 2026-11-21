package in.sp.goodDesign;

import java.math.BigDecimal;

public class InvoiceService {

    private final InvoiveCalculator invoiveCalculator;
    private final InvoiceRepository invoiceRepository;
    private final EmailSender emailSender;

    public InvoiceService() {
        this.invoiveCalculator = new InvoiveCalculator();
        this.invoiceRepository = new InvoiceRepository();
        this.emailSender = new EmailSender();
    }

    public void issueInvoice(Invoive invoive) {
        // 1. Calculate invoice
        BigDecimal tax = invoiveCalculator.calculateInvoive(invoive);

        // 2. Save invoice
        invoiceRepository.save(invoive);

        // 3. Send email
        emailSender.sendEmail(invoive);
    }


}
