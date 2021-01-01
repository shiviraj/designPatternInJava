package builder;

public class Main {

    public static void main(String[] args) {
        HtmlBuilder builder = new HtmlBuilder("ul");
        builder
            .addChild("li", "hello")
            .addChild("li", "world");
        System.out.println(builder);
    }
}
