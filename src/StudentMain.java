import java.util.Arrays;
import java.util.List;

public class StudentMain {

    public static void main(String[] args) {


        StudentGroup MainGroup = new StudentGroup("main group");
        List<Double> grades = Arrays.asList(5.0, 4.0, 4.5, 3.5, 6.0);
        Student Kamil = new Student("Kamil", "Skwierczynski", "s30740", "s30740@pjwstk.edu.pl", grades);
        System.out.println(Kamil.Srednia());

        MainGroup.addStudent(Kamil);
        MainGroup.printStudents();
    }
}