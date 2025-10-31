package structural.bridge;

class HtmlDocument extends Document {

    HtmlDocument() {
        super("I'm a HTML document", ".html");
    }

    @Override
    public String toString() {
        return "HtmlDocument {" +
                "content='" + content + '\'' +
                ", extension='" + extension + '\'' +
                '}';
    }
}
