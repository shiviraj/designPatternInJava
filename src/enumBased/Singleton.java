package enumBased;

public enum Singleton {
    INSTANCE;

    private int value;

    Singleton() {
        value = 42;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
