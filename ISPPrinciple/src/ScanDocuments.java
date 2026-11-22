public class ScanDocuments implements Scanable {
    @Override
    public void scan(String document) {
        System.out.println("Scanning document: " + document);
    }
}
