package structural.bridge;

class BridgeTest {
    private BridgeTest() {
    }

    static void main() {
        DocumentRenderer pdfRenderer = new PdfRenderer();
        DocumentRenderer htmlRenderer = new HtmlRenderer();

        pdfRenderer.render(new PdfDocument());
        htmlRenderer.render(new HtmlDocument());
        htmlRenderer.render(new PdfDocument());
    }
}
