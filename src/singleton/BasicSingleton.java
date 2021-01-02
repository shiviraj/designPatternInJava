package singleton;

import java.io.Serial;
import java.io.Serializable;

public class BasicSingleton implements Serializable {
    private BasicSingleton() {
    }

    private static final BasicSingleton INSTANCE = new BasicSingleton();

    public static BasicSingleton getInstance() {
        return INSTANCE;
    }

    private int value = 0;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Serial
    protected Object readResolve() {
        return INSTANCE;
    }
}
