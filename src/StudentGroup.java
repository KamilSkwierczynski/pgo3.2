import java.util.ArrayList;

class StudentGroup {
    public String nazwa;
    public ArrayList<Student> studenci;

    public StudentGroup(String nazwa) {
        this.nazwa = nazwa;
        this.studenci = new ArrayList<>();
    }

    public void dodajStudenta(Student nowystudent) {
        studenci.add(nowystudent);
    }

    public int LiczbaStudentow() {
        return studenci.size();
    }


    public void RozmiarGrup() throws IllegalArgumentException {
        if (LiczbaStudentow() >= 15) {
            throw new IllegalArgumentException("Maksymalnie 15 studentów w grupie.");
        }
    }

    public void powtorzenia(Student nowystudent) throws IllegalArgumentException {
        for (Student student : studenci) {
            if (nowystudent.equals(student)) {
                throw new IllegalArgumentException("Student jest już w grupie.");
            }
        }
    }
