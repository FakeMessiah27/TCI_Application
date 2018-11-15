public class Student {
    private int studentNumber;
    private String name;

    public Student(int studentNumber, String name) {
        this.studentNumber = studentNumber;
        this.name = name;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
