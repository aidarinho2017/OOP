import java.util.Iterator;
public class TestCollection {
    public static void main(String[] args) {
        MyCollection<String> myList = new MyList<>();
        myList.insert("Apple");
        myList.insert("Banana");
        myList.insert("Orange");
        myList.insert("Grapefruit");
        myList.insert("Potato");

        System.out.println("List size: " + myList.size());
        ((MyList<String>) myList).printAllElements();
        myList.clear();
        System.out.println("List size: " + myList.size());
        MyCollection<Integer> array = new MyList<>();
        for(int i=1; i<=10; i++){
            array.insert(i);
        }
        array.remove(7);
        ((MyList<Integer>) array).printAllElements();
        MyCollection<Boolean> arr = new MyList<>();
        arr.insert(true);
        arr.insert(false);
        arr.insert(true);
        arr.insert(false);
        arr.insert(true);
        arr.insert(false);
        arr.remove(true);
        ((MyList<Boolean>) arr).printAllElements();
        MyCollection<String> mySet = new MySet<>();
        mySet.insert("Aidar");
        mySet.insert("Arsen");
        mySet.insert("Karina");

        System.out.println("Set size: " + mySet.size());
        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }






    }
}
