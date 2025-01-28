public class Paragraph extends Element {
    private String text;

    public Paragraph() {}

    public Paragraph(String text) {
        this.text = text;
    }

    public String addElement() {
        return HTML.getParagraph(this.text);
    }

    @Override
    public String toString() {
        return "Paragraph: [text=" + text + "]";
    }
}
