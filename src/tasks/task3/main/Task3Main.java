package tasks.task3.main;

import com.github.javafaker.Faker;
import tasks.task3.code.Employee;
import tasks.task3.code.EmployeeLeaveCalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Task3Main {

    private static Employee createFakeEmployee() {
        Faker faker = new Faker(new Locale("en-IND"));
        return new Employee((short) faker.number().numberBetween(100,999), faker.name().fullName(),
                faker.number().randomDouble(2, 30000, 50000),
                (byte) faker.number().numberBetween(0, 30));
    }

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            employeeList.add(createFakeEmployee());
        }
        System.out.println(employeeList);
        EmployeeLeaveCalculator leaveCalculator = new EmployeeLeaveCalculator();

        List<Short> employeeID = leaveCalculator.getDefaulterEmployeeIDList(employeeList);
        System.out.println(employeeID);
        System.out.println(employeeList);

    }
}
