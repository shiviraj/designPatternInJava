package pattern.design.solid.ocp;

public interface Specification<T> {
    boolean isSatisfied(T item);
}
