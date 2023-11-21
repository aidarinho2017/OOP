import java.util.Vector;
import java.util.Date;
public class Manager extends Employee implements Cloneable {
    private Vector<Employee> team;
    private double bonus;

    public Manager(String name, double annualSalary, Date hireDate, String nationalInsuranceNumber,
                   Vector<Employee> team, double bonus) {
        super(name, annualSalary, hireDate, nationalInsuranceNumber);
        this.team = team;
        this.bonus = bonus;
    }

    public Vector<Employee> getTeam() {
        return team;
    }

    public void giveBonus(Employee e, int money) {
        if (this.team.contains(e)) {
            e.getBonus(money);
        } else {
            System.out.println("Employee is not in the team. Bonus not given.");
        }
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + getName() + '\'' +
                ", annualSalary=" + getAnnualSalary() +
                ", hireDate=" + getHireDate() +
                ", nationalInsuranceNumber='" + getNationalInsuranceNumber() + '\'' +
                ", team=" + team +
                ", bonus=" + bonus +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Manager manager = (Manager) obj;
        return Double.compare(manager.bonus, bonus) == 0 &&
                team.equals(manager.team);
    }

    public int compareTo(Manager other) {
        if (this.getAnnualSalary() != other.getAnnualSalary()) {
            return Double.compare(other.getAnnualSalary(), this.getAnnualSalary());
        } else if (this.bonus != other.bonus) {
            return Double.compare(other.bonus, this.bonus);
        } else {
            return 0;
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Manager clonedManager = (Manager) super.clone();
        clonedManager.team = new Vector<>(this.team);
        return clonedManager;
    }
}