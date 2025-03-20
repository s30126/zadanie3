import java.util.ArrayList;

public class Student {

    String fname;
    String lname;
    String indexNumber;
    String email;
    String address;
    ArrayList<Double> grades;

    public Student(String fname, String lname, String indexNumber, String email, String address, ArrayList<Double> grades) {

        this.fname = fname;
        this.lname = lname;
        this.indexNumber = indexNumber;
        this.email = email;
        this.address = address;
        this.grades = grades;

    }

    public void addGrade(double grade) {
        this.grades.add(grade);
    }

    public double getFinalGrade() {

        double gradeSum = 0;

        for (int i = 0; i < this.grades.size(); i++) {
            gradeSum += this.grades.get(i);
        }

        double averageGrade = gradeSum / this.grades.size();

        double finalGrade = (Math.round(averageGrade * 2)) / 2;

        return finalGrade;

    }

}
