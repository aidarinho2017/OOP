import java.util.Comparator;

public class EmployeeComparators {
    public static Comparator<Employee> sortByHireDate = new Comparator<Employee>() {
        @Override
        public int compare(Employee employee1, Employee employee2) {
            return employee1.getHireDate().compareTo(employee2.getHireDate());
        }
    };
    public static Comparator<Employee> sortByName = new Comparator<Employee>() {
        @Override
        public int compare(Employee employee1, Employee employee2) {
            return employee1.getName().compareTo(employee2.getName());
        }
    };
}