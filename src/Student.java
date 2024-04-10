import java.util.ArrayList;

public class Student {
    public String fname;
    public String iname;
    public String indexNumber;
    public String email;
    public String address;
    public ArrayList<Double> grades = new ArrayList<>();

    public Student(String fname, String iname, String indexNumber, String email, String address) {
        this.fname = fname;
        this.iname = iname;
        this.indexNumber = indexNumber;
        this.email = email;
        this.address = address;
    }
    public double Srednia() throws IllegalArgumentException {
        if (this.grades.isEmpty())
            throw new IllegalArgumentException("Grades cannot be empty");
        else if (this.grades.size() > 20)
            throw new IllegalArgumentException("Number of grades cannot exceed 20");

        double gradesSum = getListSum(grades);
        double gradesAverage = gradesSum / this.grades.size();
        return gradesAverage;
    }

    public double LiczenieSumy () {
        int suma = 0;
        for (double num : grades) {
            suma += num;
        }
        return suma;
    }
}
