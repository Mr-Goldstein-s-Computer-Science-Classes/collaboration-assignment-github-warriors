public class Main {
    public static void main(String[] args) {

        Gradebook grades = new Gradebook();

        grades.createStudent("Tyler");
        grades.createStudent("James");
        grades.createStudent("Ethan");
        grades.createStudent("Scotty");
        grades.createStudent("David");
        grades.createStudent("Patrick");

        grades.addAssignment("Stacks And Queues Station Activity");
        grades.addAssignment("Stacks and queues programs");
        grades.addAssignment("Stacks and queues quiz");
        grades.addAssignment("Github Exploration");

        grades.gradeAssignment("Stacks And Queues Station Activity", "Tyler", 94);
        grades.gradeAssignment("Stacks And Queues Station Activity", "James", 14);
        grades.gradeAssignment("Stacks And Queues Station Activity", "Ethan", 5);
        grades.gradeAssignment("Stacks And Queues Station Activity", "Scotty", 100);
        grades.gradeAssignment("Stacks And Queues Station Activity", "David", 0);
        grades.gradeAssignment("Stacks And Queues Station Activity", "Patrick", 79);

        grades.gradeAssignment("Stacks and queues programs", "Tyler", 100);
        grades.gradeAssignment("Stacks and queues programs", "James", 64);
        grades.gradeAssignment("Stacks and queues programs", "Ethan", 100);
        grades.gradeAssignment("Stacks and queues programs", "Scotty", 101);
        grades.gradeAssignment("Stacks and queues programs", "David", 26);
        grades.gradeAssignment("Stacks and queues programs", "Patrick", 99);

        grades.gradeAssignment("Stacks and queues quiz", "Tyler", 100);
        grades.gradeAssignment("Stacks and queues quiz", "James", 100);
        grades.gradeAssignment("Stacks and queues quiz", "Ethan", 100);
        grades.gradeAssignment("Stacks and queues quiz", "Scotty", 87);
        grades.gradeAssignment("Stacks and queues quiz", "David", 92);
        grades.gradeAssignment("Stacks and queues quiz", "Patrick", 83);

        grades.gradeAssignment("Github Exploration", "Tyler", 96);
        grades.gradeAssignment("Github Exploration", "James", 43);
        grades.gradeAssignment("Github Exploration", "Ethan", 100);
        grades.gradeAssignment("Github Exploration", "Scotty", 97);
        grades.gradeAssignment("Github Exploration", "David", 28);
        grades.gradeAssignment("Github Exploration", "Patrick", 100);

        System.out.println("Average Grade for Stacks And Queues Station Activity: " + grades.getAverageGrade("Stacks And Queues Station Activity"));
        System.out.println("Minimum Grade for Stacks And Queues Station Activity: " + grades.getMinimumGrade("Stacks And Queues Station Activity"));
        System.out.println("Maximum Grade for Stacks And Queues Station Activity: " + grades.getMaximumGrade("Stacks And Queues Station Activity"));

        System.out.println("Average Overall Grade: " + grades.getAverageOverall());
        System.out.println("Minimum Overall Grade: " + grades.getMinOverall());
        System.out.println("Maximum Overall Grade: " + grades.getMaxOverall());


        System.out.println(grades);

        System.out.println(grades.getStudent("Tyler"));
        System.out.println(grades.getStudent("James"));
        System.out.println(grades.getStudent("Ethan"));
        System.out.println(grades.getStudent("Scotty"));


    }
}
