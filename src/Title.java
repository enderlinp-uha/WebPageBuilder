public class Title extends Element {
    private String text;
    private int level;

    public Title() {}

    public Title(String text, int level) {
        this.text = text;
        this.level = level;
    }

    public String addElement() {
        return HTML.getTitle(this.text, this.level);
    }

    @Override
    public String toString() {
        return "Title: [text=" + this.text + ", level=" + this.level + "]";
    }
}
