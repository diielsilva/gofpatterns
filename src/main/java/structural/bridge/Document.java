package structural.bridge;

abstract class Document {
    protected final String content;
    protected final String extension;

    Document(String content, String extension) {
        this.content = content;
        this.extension = extension;
    }

    String getContent() {
        return content;
    }

    String getExtension() {
        return extension;
    }
}
