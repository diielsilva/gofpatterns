package structural.bridge;

class HtmlRenderer implements DocumentRenderer {

    @Override
    public void render(Document document) {
        if (!document.extension.equals(".html")) {
            IO.println("I can't render this document");
        } else {
            IO.println(document);
        }
    }
}
