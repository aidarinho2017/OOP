import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyList<E> implements MyCollection<E> {

    private List<E> elements;

    public MyList() {
        elements = new ArrayList<>();
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
    public void printAllElements() {
        for (E element : elements) {
            System.out.println(element);
        }
    }
}
