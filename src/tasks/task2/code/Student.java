package tasks.task2.code;

import java.util.Objects;

public class Student {
    private byte rollNumber;
    private final String studentName;
    private final long guardianContact;
    private double marks;

    public Student(byte rollNumber, String studentName, long guardianContact, double marks) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.guardianContact = guardianContact;
        this.marks = marks;
    }

    public byte getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(byte rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public long getGuardianContact() {
        return guardianContact;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNumber == student.rollNumber && guardianContact == student.guardianContact && Double.compare(student.marks, marks) == 0 && Objects.equals(studentName, student.studentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber, studentName, guardianContact, marks);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", studentName='" + studentName + '\'' +
                ", guardianContact=" + guardianContact +
                ", marks=" + marks +
                '}';
    }
}
