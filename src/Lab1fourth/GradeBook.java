package Lab1fourth;
import StudentLab2.Student;
import java.util.Vector;
public class GradeBook {
	private double sum=0;
	private double count=0;
	private double low=101;
	private double high=0;
	private double average;
	private Student bestStudent;
	private Student studentWithLowestGrade;
	Course KBTUCourse;
	Vector<Student> students = new Vector<Student>();
	Vector<Double> grades = new Vector<Double>();
	String[] gradeDistribution = {"00-09: ", "10-19: ", "20-29: ", "30-39: ", "40-49: ",
			"50-59: ", "60-69: ", "70-79: ", "80-89: ", "90-99: ", "100: "};
	void welcomeMessage(Course KBTUCourse) {
		System.out.println("WElcome to Course! ");
		System.out.print(KBTUCourse.toString());
	}
	public void Run(double x, Student s)
	{
		determineClassAverage(x);
		updateLow(x,s);
		updateHigh(x,s);
	}
	public void determineClassAverage(double x){
		sum += x;
		count++;
		average = (sum/count);
	}
	private void updateLow(double x, Student s){
		if(x <= low)
		{
			low = x;
			studentWithLowestGrade = s;
		}
	}
	
	private void updateHigh(double x, Student s){
		if(x >= high)
		{
			high = x;
			bestStudent = s;
		}
	}
	void barChart() {
		for(Double grade: grades) {
			double k = grade/10;
			int j = (int) k;
			gradeDistribution[j] += '*';
		}
		for(String mark: gradeDistribution) {
			System.out.println(mark);
		}
	}
	public void push_back(Student s){
		students.add(s);
	}
	public void push_back(double x){
		grades.add(x);
	}
	
	public double getHigh() {
		return high;
	}
	
	public double getLow() {
		return low;
	}
	public Student getStudentWithLowestGrade() {
		return studentWithLowestGrade;
	}
	public Student getBestStudent() {
		return bestStudent;
	}
	public double getAverage() {
		return average;
	}
	
	public void setCourse(Course c)
	{
		KBTUCourse = c;
	}
}
