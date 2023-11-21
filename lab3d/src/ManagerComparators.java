import java.util.Comparator;

public class ManagerComparators {
    public static Comparator<Manager> sortByHireDate = new Comparator<Manager>() {
        @Override
        public int compare(Manager manager1, Manager manager2) {
            return manager1.getHireDate().compareTo(manager2.getHireDate());
        }
    };
    public static Comparator<Manager> sortByName = new Comparator<Manager>() {
        @Override
        public int compare(Manager manager1, Manager manager2) {
            return manager1.getName().compareTo(manager2.getName());
        }
    };
}
