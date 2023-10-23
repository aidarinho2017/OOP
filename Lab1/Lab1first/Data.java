package Lab1first;
public class Data {
	int i;
	int j;
	private static int l=0;
	int k;
	Data(int k){
		this.k=k;
		this.i=0;
		this.j=0;
	}
    public static int getMax() {
		return l;
	}
	public static void setMax(int l) {
		Data.l = l;
	}
	public void sum(int k) {
		this.i+=k;
		this.j++;
	}
	public void maximumNum(int k) {
		if(k>getMax()) {
			setMax(k);
		}
	}
	

//   */ public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter an integer (Q to exit: ) ");
//        int a = scanner.nextInt();
//        Data myObj1 = new Data(a);
//        myObj1.maximumNum(a);
//        myObj1.sum(a);
//        
//
//        while(true) {
//            try {
//                System.out.print("Enter (Q to exit): ");
//                a = scanner.nextInt();
//                myObj1.maximumNum(a);
//                myObj1.sum(a);
//            } catch (java.util.InputMismatchException e) {
//                break;
//            }
//        }
//
//        scanner.close();
//        
//    Analyzer analyzer = new Analyzer(myObj1);
//    System.out.println("Average: " + analyzer.calculateAverage());
//    System.out.println("Maximum: " + analyzer.getMaximum());
//}
	}



