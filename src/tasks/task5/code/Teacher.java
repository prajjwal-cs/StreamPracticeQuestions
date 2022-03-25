package tasks.task5.code;

import java.util.List;
import java.util.Objects;

public class Teacher {
    private final String employeeID;
    private final String teacherName;
    private double teacherSalary;
    private List<String> teacherSubject;

    public Teacher() {
        this.employeeID = null;
        this.teacherName = null;
        this.teacherSalary = 0.0;
        this.teacherSubject = null;
    }

    public Teacher(String employeeID, String teacherName, double teacherSalary, List<String> teacherSubject) {
        this.employeeID = employeeID;
        this.teacherName = teacherName;
        this.teacherSalary = teacherSalary;
        this.teacherSubject = teacherSubject;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public double getTeacherSalary() {
        return teacherSalary;
    }

    public void setTeacherSalary(double teacherSalary) {
        this.teacherSalary = teacherSalary;
    }

    public List<String> getTeacherSubject() {
        return teacherSubject;
    }

    public void setTeacherSubject(List<String> teacherSubject) {
        this.teacherSubject = teacherSubject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Double.compare(teacher.teacherSalary, teacherSalary) == 0 && Objects.equals(employeeID, teacher.employeeID) && Objects.equals(teacherName, teacher.teacherName) && Objects.equals(teacherSubject, teacher.teacherSubject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeID, teacherName, teacherSalary, teacherSubject);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "employeeID='" + employeeID + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", teacherSalary=" + teacherSalary +
                ", teacherSubject=" + teacherSubject +
                '}';
    }
}
