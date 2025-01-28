public abstract class Element implements IElement {
    protected String alt;
    protected String href;
    protected String src;
    protected String text;

    public String getText() {
        return this.text;
    }

    public Element setAlt(String alt)  {
        this.alt = alt;
        return this;
    }

    public Element setHref(String href) {
        this.href = href;
        return this;
    }

    public Element setSrc(String src, String alt) {
        this.src = src;
        return this;
    }

    public Element setText(String text) {
        this.text = text;
        return this;
    }
}
