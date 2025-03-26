import java.util.ArrayList;

public class StudentGroup {

    String nazwa;
    ArrayList<Student> students;

    public StudentGroup(String nazwa, ArrayList<Student> students) {
        this.nazwa = nazwa;
        this.students = students;
    }

    public void addStudent(Student student) {
         if (students.size() == 15) {
             throw new IllegalStateException("The maximum number of students in one group is 15.");
         }
         if (students.contains(student)) {
             throw new IllegalStateException("This student is already in this group.");
         }
        students.add(student);
    }

}
