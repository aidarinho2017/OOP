import java.util.Iterator;

public interface MyCollection<E> extends Iterable<E>{
    void insert(E element);
    void remove(E element);
    void clear();
    boolean contains(E element);
    boolean isEmpty();
    int size();
    Iterator<E> iterator();
}

