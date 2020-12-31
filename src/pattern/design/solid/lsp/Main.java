package pattern.design.solid.lsp;

public class Main {

    public static void main(String[] args) {
        Rectangle rc = new Rectangle(2, 3);
        useIt(rc);

        Rectangle sq = new Square(2);
        useIt(sq);
    }

    private static void useIt(Rectangle r) {
        int width = r.getWidth();
        r.setHeight(10);
        System.out.println("Expected area " + width * 10 + ", got " + r.area());
    }
}
