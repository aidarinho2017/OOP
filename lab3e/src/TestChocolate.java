import java.util.Vector;

public class TestChocolate {
    public static void main(String[] args){
        Chocolate c1 = new Chocolate("twix", 70);
        Chocolate c2 = new Chocolate("snickers", 80);
        Chocolate c3 = new Chocolate("mars", 90);
        Chocolate c4 = new Chocolate("bounty", 100);
        Chocolate c5 = new Chocolate("oreo", 7);
        Chocolate c6 = new Chocolate("nuts", 8);
        Chocolate c7 = new Chocolate("kitkat", 9);
        Chocolate c8 = new Chocolate("kinder", 70);
        Chocolate c9 = new Chocolate("merci", 1000);
        Vector<Chocolate> array = new Vector<>();
        array.add(c1);
        array.add(c2);
        array.add(c3);
        array.add(c4);
        array.add(c5);
        array.add(c6);
        array.add(c7);
        array.add(c8);
        array.add(c9);
        Sort.selectionSort(array, 2);
        for(int i=0; i < 9; ++i)
        {
            System.out.println(array.get(i));
        }
        Vector<Time> times = new Vector<>();
        Time t1 = new Time(20, 10, 2);
        Time t2 = new Time(23, 9, 2);
        Time t3 = new Time(21, 10, 2);
        Time t4 = new Time(20, 10, 2);
        Time t5 = new Time(13, 10, 2);
        times.add(t1);
        times.add(t2);
        times.add(t3);
        times.add(t4);
        times.add(t5);
        Sort.bubbleSort(times);
        for(int i=0; i < 5; ++i)
        {
            System.out.println(times.get(i));
        }





    }
}
