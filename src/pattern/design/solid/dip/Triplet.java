package pattern.design.solid.dip;

public class Triplet<T0, T1, T2> {

    private final T0 item0;
    private final T1 item1;
    private final T2 item2;

    public Triplet(T0 item0, T1 item1, T2 item2) {
        this.item0 = item0;
        this.item1 = item1;
        this.item2 = item2;
    }

    public T0 getValue0() {
        return item0;
    }

    public T1 getValue1() {
        return item1;
    }

    public T2 getValue2() {
        return item2;
    }
}
