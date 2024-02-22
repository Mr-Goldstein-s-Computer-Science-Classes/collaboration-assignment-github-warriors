import java.util.ArrayList;
import java.util.List;
public class Gradebook {

    private List<Student> students = new ArrayList<Student>();
    private ArrayList<String> assignments = new ArrayList<String>();

    public Gradebook() {

    }

    public void createStudent(String name) {
        students.add(new Student(name));
    }

    public void addAssignment(String assignment) {
        assignments.add(assignment);
        for (Student student : students) {
            student.addAssignment(assignment);
        }
    }

    public void gradeAssignment(String assignment, String studentName, double grade) {
        for (Student student : students) {
            if (studentName.equals(student.toString().split("-")[0])) {
                student.gradeAssignment(assignment, grade);
                break;
            }
        }

    }

    public double getAverageGrade(String assignment) {
        double sum = 0;
        int count = 0;
        for (Student student : students) {
            sum += student.getAssignmentGrade(assignment);
            count++;
        }
        if (count > 0) {
            return sum / count;
        } else {
            return 0.0;
        }
    }

    public double getMinimumGrade(String assignment) {
        double minGrade = Double.MAX_VALUE;
        for (Student student : students) {
            double grade = student.getAssignmentGrade(assignment);
            if (grade < minGrade && grade > 0) {
                minGrade = grade;
            }
        }
        if (minGrade == Double.MAX_VALUE) {
            return 0.0;
        } else {
            return minGrade;
        }

    }

    public double getMaximumGrade(String assignment) {
        double maxGrade = Double.MIN_VALUE;
        for (Student student : students) {
            double grade = student.getAssignmentGrade(assignment);
            if (grade > maxGrade) {
                maxGrade = grade;
            }
        }
        if (maxGrade == Double.MIN_VALUE) {
            return 0.0;
        } else {
            return maxGrade;
        }

    }

    public double getAverageOverall() {
        double sum = 0;
        int count = 0;
        for (Student student : students) {
            sum += student.getOverallGrade();
            count++;
        }
        if (count > 0) {
            return sum / count;
        } else {
            return 0.0;
        }

    }

    public double getMaxOverall() {
        double maxGrade = Double.MIN_VALUE;
        for (Student student : students) {
            double grade = student.getOverallGrade();
            if (grade > maxGrade) {
                maxGrade = grade;
            }
        }
        if (maxGrade == Double.MIN_VALUE) {
            return 0.0;
        } else {
            return maxGrade;
        }

    }

    public double getMinOverall() {
        double minGrade = Double.MAX_VALUE;
        for (Student student : students) {
            double grade = student.getOverallGrade();
            if (grade < minGrade && grade > 0) {
                minGrade = grade;
            }
        }
        if (minGrade == Double.MAX_VALUE) {
            return 0.0;
        } else {
            return minGrade;
        }

    }

    public double getStudentsGrade(String studentName) {
        for (Student student : students) {
            if (studentName.equals(student.toString().split("-")[0])) {
                return student.getOverallGrade();
            }
        }
        return 0.0;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("Gradebook:\n");
        for (Student student : students) {
            result.append(student.toString()).append("\n");
        }
        return result.toString();
    }

    public Student getStudent(String studentName) {
        for (Student student : students) {
            if (studentName.equals(studentName.toString().split("-")[0])) ;
            {
                return student;
            }
        }
            return null;
}

}
