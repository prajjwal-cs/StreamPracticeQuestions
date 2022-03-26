package tasks.task3.code;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeLeaveCalculator {

    public List<Short> getDefaulterEmployeeIDList(List<Employee> employeeList) {
        return employeeList.stream()
                .filter(employee -> employee.getNumberOfLeaves() > 25)
                .peek(e -> e.setSalary(e.getSalary() - e.getSalary() * 0.01))
                .distinct()
                .map(Employee::getEmployeeId)
                .toList();
    }

    private String employeeDetail(Employee employee) {
        return employee.getNameOfEmployee().concat("-").concat(String.valueOf(employee.getNumberOfLeaves()));
    }

    public ArrayList<String> getNumberOfLeaves(List<Employee> employeeList) {
        return employeeList.stream().map(this::employeeDetail)
                .collect(Collectors.toCollection(ArrayList::new));
    }

}
