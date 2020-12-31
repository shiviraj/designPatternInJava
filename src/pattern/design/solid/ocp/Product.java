package pattern.design.solid.ocp;

public class Product {
    public final String name;
    public final Color color;
    public final Size size;

    public Product(String name, Color color, Size size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }
    
}
