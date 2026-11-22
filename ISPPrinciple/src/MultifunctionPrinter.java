public class MultifunctionPrinter implements Printable, Scanable, Faxable {
    @Override
    public void print(String document) {
        System.out.println("MultifunctionPrinter printing: " + document);
    }

    @Override
    public void scan(String document) {
        System.out.println("MultifunctionPrinter scanning: " + document);
    }

    @Override
    public void fax(String document) {
        System.out.println("MultifunctionPrinter faxing: " + document);
    }
}
