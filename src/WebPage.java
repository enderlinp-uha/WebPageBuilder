import java.util.ArrayList;

public class WebPage {

    private Element element;
    private ArrayList<Element> elements;

    public WebPage() {
        this.elements = new ArrayList();
    }

    public WebPage append(Element element) {
        this.elements.add(element);
        return this;
    }

    private String getElements() {
        String html = "";
        for (Element element : this.elements) {
            html += element.addElement();
        }
        return html;
    }

    public String toHTML() {
        HTML html = new HTML(this.getElements());
        return html.build();
    }

    public void toFile() {
        UtilsHTML.writeHTMLToIndex(this.toHTML());
    }
}
