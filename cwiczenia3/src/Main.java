import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Jan", "Kowalski", "s12345", "jan@mail.com",
                "Ulica 123", new ArrayList<>());

        student1.addGrade(5.0);
        student1.addGrade(4.5);
        student1.addGrade(4.0);
        student1.addGrade(3.0);

        student1.getFinalGrade();

        StudentGroup group1 = new StudentGroup("14c", new ArrayList<>());
        group1.addStudent(student1);

    }
}
