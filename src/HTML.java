public class HTML {
    private String body;

    public HTML(String body) {
        this.body = body;
    }

    public String getFooter() {
        StringBuilder sb = new StringBuilder();
        sb.append("</body>\n");
        sb.append("</html>\n");
        return sb.toString();
    }

    public String getBody() {
        return this.body;
    }

    public String getHeader() {
        StringBuilder sb = new StringBuilder();
        sb.append("<html lang=\"fr\">\n");
        sb.append("<head>\n");
        sb.append("\t<meta charset=\"utf-8\">\n");
        sb.append("</head>\n");
        sb.append("<body>\n");
        return sb.toString();
    }

    public String build() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getHeader());
        sb.append(this.getBody());
        sb.append(this.getFooter());
        return sb.toString();
    }

    public static String getHr() {
        return "\t<hr />\n";
    }

    public static String getImage(String src, String alt) {
        return "\t<img src=\"" + src + "\" alt=\"" + alt + "\" />\n";
    }

    public static String getLink(String href, String text) {
        return "\t<a href=\"" + href + "\">" + text + "</a>\n";
    }

    public static String getParagraph(String text) {
        return "\t<p>" + text + "</p>\n";
    }

    public static String getTitle(String text, int level) {
        return "\t<h" + level + ">" + text + "</h" + level + ">\n";
    }
}
