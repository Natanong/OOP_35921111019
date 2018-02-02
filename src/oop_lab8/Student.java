package oop_lab8;

public class Student extends Person {
    private String studentID;
    private String major;

    public Student(String personID, String name,
                   String address, String gender,
                   String studentID, String major) {
        super(personID, name, address, gender);
        this.studentID = studentID;
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", major='" + major + '\'' +
                "} " + super.toString();
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}//class
