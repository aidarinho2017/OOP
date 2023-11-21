import java.util.*;

public class SortingTest {
    public static void main(String[] args) {
        Vector<Manager> managers = new Vector<>();
        Vector<Employee> team = new Vector<>();
        Employee employee1 = new Employee("Айдар", 50000.0, new Date(), "KZ123456");
        Employee employee2 = new Employee("Әлия", 60000.0, new Date(), "KZ789012");
        team.add(employee1);
        team.add(employee2);
        Manager manager = new Manager("Айдар Менеджер", 10000.0, new Date(2021, Calendar.OCTOBER, 15, 23, 34, 01), "KZ000001", team, 20000);
        Manager manager1 = new Manager("Бека Менеджер", 80000.0, new Date(2022, Calendar.OCTOBER, 13, 23, 34, 01), "KZ000001", team, 20000);
        Manager manager2 = new Manager("Нуржан Менеджер", 40000.0, new Date(2017, Calendar.OCTOBER, 19, 23, 34, 01), "KZ000001", team, 20000);
        Manager manager3 = new Manager("Алибек Менеджер", 60000.0, new Date(2019, Calendar.OCTOBER, 13, 23, 34, 01), "KZ000001", team, 20000);
        Manager manager4 = new Manager("Бейбит Менеджер", 50000.0, new Date(2022, Calendar.JANUARY, 13, 23, 34, 01), "KZ000001", team, 20000);
        managers.add(manager);
        managers.add(manager1);
        managers.add(manager2);
        managers.add(manager3);
        managers.add(manager4);
        List<Employee> employees = new Vector<>();
        Employee employee3 = new Employee("Arnur", 80000.0, new Date(), "KZ789012");
        Employee employee4 = new Employee("Nurbek", 70000.0, new Date(), "KZ789012");
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        System.out.println("Not sorted");
        for (Employee m : managers) {
            System.out.println(m);
        }
        System.out.println("Sorted");
        Sort.selectionSort(managers);
        for (Employee m : managers) {
            System.out.println(m);
        }
    }
}

