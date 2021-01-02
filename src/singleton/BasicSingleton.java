package singleton;

public class BasicSingleton {
    private BasicSingleton() {
    }

    private static final BasicSingleton instance = new BasicSingleton();

    public static BasicSingleton getInstance() {
        return instance;
    }

    private int value = 0;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
