import java.util.ArrayList;
import java.util.List;
public class Student {

    private List<String> assignments = new ArrayList<String>();
    private List<Double> assignmentGrades = new ArrayList<Double>();
    public Student(String name)
    {
        this.name=name;
    }
    public void addAssignment(String assignName)
    {
        assignments.add(assignName);
        assignmentGrades.add(null);

    }
    public void gradeAssignments(String assignment, double grade)
    {
        int index = assignments.indexOf(assignment);
        if (index != -1) {
            assignmentGrades.set(index, grade);
        }

    }

    public double getAssignment(String assignment)
    {
    int index = assignments.indexOf(assignment);
        if (index != -1 && assignmentGrades.get(index) != null) {
            return assignmentGrades.get(index);
        } else {
            return 0.0;
        }

    }

    public double getOverallGrade()
    {
        double sum = 0;
        int count = 0;
        for (Double grade : assignmentGrades) {
            if (grade != null) {
                sum += grade;
                count++;
            }
        }
        if (count > 0) {
            return sum / count;
        } else {
            return 0.0;
        }
    }

    public String toString()
    {
        return name + " - Average Grade: " + getOverallGrade();
    }
}
