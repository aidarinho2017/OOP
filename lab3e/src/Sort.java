import java.util.Vector;

public class Sort {

    public Sort() {
    };

    static <E> void swap(Vector<E> vector, int i, int j) {
        E temp = vector.get(i);
        vector.set(i, vector.get(j));
        vector.set(j, temp);
    }

    static <E extends Comparable<E>> void bubbleSort(Vector<E> vector) {
        for (int i = 0; i < vector.size(); ++i) {
            for (int j = i; j < vector.size(); ++j) {
                if (vector.get(i).compareTo(vector.get(j)) > 0) {
                    swap(vector, i, j);
                }
            }
        }
    }

    static <E extends Comparable<E>> void selectionSort(Vector<E> vector, int a) {
        int n = vector.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (vector.get(j).compareTo(vector.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            swap(vector, i, minIndex);
        }
    }
    static <E extends Comparable<E>> void selectionSort(Vector<Manager> vector) {
        int n = vector.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (vector.get(j).compareTo(vector.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            swap(vector, i, minIndex);
        }
    }
}
