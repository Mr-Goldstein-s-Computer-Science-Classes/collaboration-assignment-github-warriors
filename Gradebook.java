import java.util.ArrayList;
import java.util.List;
public class Gradebook {

    private List<Student> students = new ArrayList<Student>();
    private ArrayList<String> assignments = new ArrayList<String>();
    public Gradebook()
    {

    }
    public void createStudent(String name)
    {
        students.add(new Student(name));
    }

    public void addAssignment(String assignment)
    {
        assignments.add(assignment);
        for(Student student:students){
            student.addAssignment(assignment);
        }
    }
    public void gradeAssignment(String assignment,String studentName, double grade)
    {
        for(Student student:students)
        {
            if(studentName.equals(student.toString().split("-")[0])){
                student.gradeAssignment(assignment, grade);
                break;
            }
        }

    }
    public double getAverageGrade(String assignment)
    {
        double sum = 0;
        int count = 0;
        for(Student student:students)
        {
            sum += student.getAssignmentGrade(assignment);
            count++;
        }
        if(count > 0){
            return sum/count;
        }
        else{
            return 0.0;
        }
    }
    public double getMinimumGrade(String assignment)
    {
        double minGrade = Double.MAX_VALUE;
        for(Student student: students)
        {
            double grade = student.getAssignmentGrade(assignment);
        }

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
    public double getMinOverall()
    {

    }
    public double getStudentsGrade()
    {

    }




}
