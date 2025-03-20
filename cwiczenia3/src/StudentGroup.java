import java.util.ArrayList;

public class StudentGroup {

    String nazwa;
    ArrayList<Student> students;

    public void addStudent(Student student) {
         students.add(student);
         if (students.size() == 15) {
             throw new IllegalStateException("The maximum number of students in one group is 15.");
         }
         if (students.contains(student)) {
             throw new IllegalStateException("This student is already in this group.");
         }
    }

}
