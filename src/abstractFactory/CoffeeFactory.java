package abstractFactory;

public class CoffeeFactory implements HotDrinkFactory {
    @Override
    public HotDrink prepare(int amount) {
        System.out.println("Grind some bean, boil water, pour " + amount + "ml, add cream and sugar, Enjoy!!");
        return new Coffee();
    }
}
