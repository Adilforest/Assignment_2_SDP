package documents;

public class Main {
    public static void main(String[] args) {
        DocumentFactory factory = new DocumentFactory();

        Document pdfDoc = factory.createDocument("pdf");
        pdfDoc.create();

        Document wordDoc = factory.createDocument("word");
        wordDoc.create();
    }
}
