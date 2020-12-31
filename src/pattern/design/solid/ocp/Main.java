package pattern.design.solid.ocp;

import com.sun.tools.javac.util.List;

public class Main {
    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.LARGE);

        List<Product> products = List.of(apple, house, tree);

        BetterFilter bf = new BetterFilter();
        bf.filter(products, new ColorSpecification(Color.GREEN))
            .forEach(p -> System.out.println(
                "- " + p.name + " is green."));

        bf.filter(products, new AndSpecification<>(new ColorSpecification(Color.BLUE),
            new SizeSpecification(Size.LARGE)))
            .forEach(p -> System.out.println(
                "- " + p.name + " is large blue."));

    }
}
