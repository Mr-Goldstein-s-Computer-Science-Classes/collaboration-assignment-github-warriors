import java.util.ArrayList;
public class Gradebook {
    private String studentName;

    private double grade;
    private ArrayList<String> assignments = new ArrayList<String>();
    private ArrayList<Student> grades = new ArrayList<Student>();
    public Gradebook()
    {

    }
    public void createStudent(String name)
    {
        Student students = new Student(name);
    }

    public void addAssignment(String assignment)
    {
       assignments.add(assignment);
    }
    public void gradeAssignment(String assignment,String studentName, double grade)
    {

    }
    public double getAverageGrade(String assignment)
    {

    }
    public getMinimumGrade(String assignment)
    {

    }
    public double getMaximumGrade(String assignment)
    {

    }
    public double getAverageOverall()
    {

    }
    public double getMaxOverall()
    {

    }
    public double getMinOverall




}
