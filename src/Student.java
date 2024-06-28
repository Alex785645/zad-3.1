import java.util.HashSet;
import java.util.Set;

class Student {
    private String fname;
    private String lname;
    private String indexNumber;
    private String email;
    private String address;
    private Set<Double> grades;
    private Set<StudentGroup> studentGroups;

    public Student(String fname, String lname, String indexNumber, String email, String address) {
        this.fname = fname;
        this.lname = lname;
        this.indexNumber = indexNumber;
        this.email = email;
        this.address = address;
        this.grades = new HashSet<>();
        this.studentGroups = new HashSet<>();
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public void addStudentGroup(StudentGroup group) {
        studentGroups.add(group);
        group.getStudents().add(this);
    }

    public void removeStudentGroup(StudentGroup group) {
        studentGroups.remove(group);
        group.getStudents().remove(this);
    }

    public Set<StudentGroup> getStudentGroups() {
        return studentGroups;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

}

class StudentGroup {
    private String nazwa;
    private Set<Student> students;

    public StudentGroup(String nazwa) {
        this.nazwa = nazwa;
        this.students = new HashSet<>();
    }

    public Set<Student> getStudents() {
        return students;
    }

    public String getNazwa() {
        return nazwa;
    }


}