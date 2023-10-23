package Lab1first;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter (Q to exit: ) ");
        int a = scanner.nextInt();
        Data myObj1 = new Data(a);
        myObj1.maximumNum(a);
        myObj1.sum(a);
        

        while(true) {
            try {
                System.out.print("Enter (Q to exit): ");
                a = scanner.nextInt();
                myObj1.maximumNum(a);
                myObj1.sum(a);
            } catch (java.util.InputMismatchException e) {
                break;
            }
        }

        scanner.close();
        
    Analyzer analyzer = new Analyzer(myObj1);
    System.out.println("Average: " + analyzer.calculateAverage());
    System.out.println("Maximum: " + analyzer.getMaximum());
}
	}

	



