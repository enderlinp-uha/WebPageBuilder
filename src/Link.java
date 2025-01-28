public class Link extends Element {
    private String href;
    private String text;

    public Link(String text, String href) {
        this.href = href;
        this.text = text;
    }

    public String addElement() {
        return HTML.getLink(href, text);
    }

    public String toString() {
        return "Link: [href=" + this.href + ", text=" + this.text + "]";
    }
}
