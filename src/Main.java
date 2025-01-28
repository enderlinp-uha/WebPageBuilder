public class Main {
    public static void main(String[] args) {
        WebPage w = new WebPage();

        Title title = new Title("Titre H1", 1);
        w.append(title);

        Title title2 = new Title("Titre H2", 2);
        w.append(title2);

        Paragraph paragraph = new Paragraph("Hello World!");
        w.append(paragraph);

        Hr hr = new Hr();
        w.append(hr);

        Image image = new Image("https://www.google.fr/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png", "Google");
        w.append(image);

        Paragraph paragraph2 = new Paragraph("Ipsam alias totam aut aliquid ut et consequatur qui. Quia quos voluptatum eaque aut voluptas aspernatur et odio. Vel quia dolorem cum odio omnis necessitatibus ipsum incidunt. Minus ut et officia vel non magni eligendi. Sapiente similique quam qui eligendi odit dolore nihil.");
        w.append(paragraph2);

        Link link = new Link("Google", "https://www.google.fr");
        w.append(link);

        System.out.println(w.toHTML());
        w.toFile();
    }
}