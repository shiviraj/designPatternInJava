package factory;

public class Main {
    public static void main(String[] args) {
        Point point = Point.Factory.newCartesianPoint(2, 3);
        System.out.println(point);

        Point point1 = Point.Factory.newPolarPoint(2, 5);
        System.out.println(point1);
    }
}
