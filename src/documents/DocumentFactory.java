package documents;

public class DocumentFactory {
    public Document createDocument(String type) {
        if (type.equalsIgnoreCase("pdf")) {
            return new PDFDocument();
        } else if (type.equalsIgnoreCase("word")) {
            return new WordDocument();
        }
        return null;
    }
}