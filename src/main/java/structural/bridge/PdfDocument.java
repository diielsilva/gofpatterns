package structural.bridge;

class PdfDocument extends Document {

    PdfDocument() {
        super("I'm a PDF Document", ".pdf");
    }

    @Override
    public String toString() {
        return "PdfDocument {" +
                "extension='" + extension + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
