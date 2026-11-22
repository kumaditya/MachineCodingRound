public class Main {
    public static void main(String[] args) {
        PrintService printService = new PrintService();

        // 1. Using single-responsibility PrintDocuments with PrintService
        Printable printDoc = new PrintDocuments();
        printService.printDocument(printDoc, "Invoice_001.pdf");

        // 2. Using MultifunctionPrinter with PrintService
        MultifunctionPrinter mfp = new MultifunctionPrinter();
        printService.printDocument(mfp, "Annual_Report.pdf");

        // 3. Using scanning capability of MultifunctionPrinter
        mfp.scan("Contract.pdf");

        // 4. Using fax capability of MultifunctionPrinter
        mfp.fax("Agreement.pdf");

        // 5. Using dedicated ScanDocuments and FaxDocuments
        Scanable scanDoc = new ScanDocuments();
        scanDoc.scan("Identity_Proof.jpg");

        Faxable faxDoc = new FaxDocuments();
        faxDoc.fax("Legal_Notice.pdf");
    }
}
