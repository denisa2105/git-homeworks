package itschool.exercises;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("John", "Doe", 4, "CTI", true);
        System.out.println("Student's first name: " + student.getFirstName());

        Professor professor = new Professor("Mike", "Lawren", 4, "Digital circuits", false);
        System.out.println("The new professor " + professor.getFirstName() + " " + professor.getLastName() + " is a course holder: " + professor.isACourseHolder());

        Course course = new Course();
        System.out.println(course.getCreditPoints() + " " + course.getDuration());
    }
}
