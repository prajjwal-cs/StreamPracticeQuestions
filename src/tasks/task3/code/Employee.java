package tasks.task3.code;

import java.util.Objects;

public class Employee {
    private final short employeeId;
    private final String nameOfEmployee;
    private double salary;
    private byte numberOfLeaves;

    public Employee(short employeeId, String nameOfEmployee, double salary, byte numberOfLeaves) {
        this.employeeId = employeeId;
        this.nameOfEmployee = nameOfEmployee;
        this.salary = salary;
        this.numberOfLeaves = numberOfLeaves;
    }

    public short getEmployeeId() {
        return employeeId;
    }

    public String getNameOfEmployee() {
        return nameOfEmployee;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public byte getNumberOfLeaves() {
        return numberOfLeaves;
    }

    public void setNumberOfLeaves(byte numberOfLeaves) {
        this.numberOfLeaves = numberOfLeaves;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeId == employee.employeeId && Double.compare(employee.salary, salary) == 0 && numberOfLeaves == employee.numberOfLeaves && Objects.equals(nameOfEmployee, employee.nameOfEmployee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, nameOfEmployee, salary, numberOfLeaves);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", nameOfEmployee='" + nameOfEmployee + '\'' +
                ", salary=" + salary +
                ", numberOfLeaves=" + numberOfLeaves +
                '}';
    }
}
