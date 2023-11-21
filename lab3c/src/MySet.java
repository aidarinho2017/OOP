import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MySet<E> implements MyCollection<E> {

    private Set<E> elements;

    public MySet() {
        elements = new HashSet<>();
    }

    @Override
    public void insert(E element) {
        elements.add(element);
    }

    @Override
    public void remove(E element) {
        elements.remove(element);
    }

    @Override
    public void clear() {
        elements.clear();
    }

    @Override
    public boolean contains(E element) {
        return elements.contains(element);
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public Iterator<E> iterator() {
        return elements.iterator();
    }
}
