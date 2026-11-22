public class FaxDocuments implements Faxable {
    @Override
    public void fax(String document) {
        System.out.println("Faxing document: " + document);
    }
}
