public class Image extends Element {
    private final String src;
    private final String alt;

    public Image(String src, String alt) {
        this.src = src;
        this.alt = alt;
    }

    public String addElement() {
        return HTML.getImage(this.src, this.alt);
    }

    public String toString() {
        return "Image: [src=" + this.src + ", alt=" + this.alt + "]";
    }
}
