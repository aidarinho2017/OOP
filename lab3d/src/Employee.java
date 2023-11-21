import java.util.Date;
public class Employee extends Person implements Comparable<Employee>, Cloneable{
    private double annualSalary;
    private Date hireDate;
    private String nationalInsuranceNumber;


    Employee(String name, double annualSalary, Date hireDate, String nationalInsuranceNumber) {
        super(name);
        this.annualSalary = annualSalary;
        this.hireDate = hireDate;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }
    public double getAnnualSalary() {
        return annualSalary;
    }

    public Date getHireDate() {
        return hireDate;
    }
    public void getBonus(int money){
        this.annualSalary += money;
    }


    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", annualSalary=" + annualSalary +
                ", hireDate=" + hireDate +
                ", nationalInsuranceNumber='" + nationalInsuranceNumber + '\'' +
                '}';
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return Double.compare(employee.annualSalary, annualSalary) == 0 &&
                hireDate.equals(employee.hireDate) &&
                nationalInsuranceNumber.equals(employee.nationalInsuranceNumber);
    }

    public int compareTo(Employee other) {
        // Compare employees based on annual salary
        if (this.annualSalary != other.annualSalary) {
            return Double.compare(other.annualSalary, this.annualSalary);
        }
        // If salaries are equal, compare based on hire date
        else {
            return this.hireDate.compareTo(other.hireDate);
        }
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
