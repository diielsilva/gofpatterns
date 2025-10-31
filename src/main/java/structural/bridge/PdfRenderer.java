package structural.bridge;

class PdfRenderer implements DocumentRenderer {

    @Override
    public void render(Document document) {
        if (!document.extension.equals(".pdf")) {
            IO.println("I can't render this document");
        } else {
            IO.println(document);
        }
    }
}
