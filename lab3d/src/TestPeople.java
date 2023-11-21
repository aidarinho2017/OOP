import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
public class TestPeople {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person Aidar = new Person("Aidar");
        Person Arsen = new Person("Arsen");
        Person Aidar1 = new Person("Aidar");
        System.out.println(Aidar.toString());
        System.out.println(Aidar.equals(Aidar1));
        Employee employee1 = new Employee("Айдар", 50000.0, new Date(), "KZ123456");
        Employee employee2 = new Employee("Әлия", 60000.0, new Date(), "KZ789012");
        System.out.println("Employee 1: " + employee1);
        System.out.println("Employee 2: " + employee2);
        Vector<Employee> team = new Vector<>();
        team.add(employee1);
        team.add(employee2);
        Sort.selectionSort(team, 2);
        Employee employee3 = new Employee("Arnur", 80000.0, new Date(), "KZ789012");
        Employee employee4 = new Employee("Nurbek", 70000.0, new Date(), "KZ789012");
        Vector<Employee> team2 = new Vector<>();
        team2.add(employee3);
        team2.add(employee4);
        Manager manager = new Manager("Айдар Менеджер", 80000.0, new Date(2022, Calendar.OCTOBER, 13, 23, 34, 01), "KZ000001", team, 20000);
        System.out.println("Manager: " + manager);
        manager.giveBonus(employee1, 100000);
        manager.giveBonus(employee3, 100000);
        System.out.println(employee1.toString());
        Manager otherManager = new Manager("Әлия Менеджер", 90000.0, new Date(), "KZ000002", team2, 10000);
        System.out.println("Comparison result: " + manager.compareTo(otherManager));
        Manager clonedManager = (Manager) manager.clone();
        System.out.println("Original Manager: " + manager);
        System.out.println("Cloned Manager: " + clonedManager);
        System.out.println("Are original and cloned managers equal? " + manager.equals(clonedManager));
        System.out.println("Are original and cloned team objects equal? " + (manager.getTeam().equals(clonedManager.getTeam())));
    }
}
