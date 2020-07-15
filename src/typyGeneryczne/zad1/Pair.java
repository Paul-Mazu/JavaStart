package typyGeneryczne.zad1;

public class Pair<T,V> {
    private T firstObject;
    private V secondobject;

    public Pair (T t, V v) {
        firstObject = t;
        secondobject = v;
    }

    public T getFirstObject() {
        return firstObject;
    }

    public void setFirstObject(T firstObject) {
        this.firstObject = firstObject;
    }

    public V getSecondobject() {
        return secondobject;
    }

    public void setSecondobject(V secondobject) {
        this.secondobject = secondobject;
    }

    public <T, V> void print () {
        System.out.println(firstObject);
        System.out.println(secondobject);
    }

}
