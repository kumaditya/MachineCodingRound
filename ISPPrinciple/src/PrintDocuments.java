public class PrintDocuments implements Printable {
    @Override
    public void print(String document) {
        System.out.println("Printing document: " + document);
    }
}
