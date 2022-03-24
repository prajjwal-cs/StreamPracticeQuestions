package tasks.task3.code;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeLeaveCalculator {
    public List<Short> getDefaulterEmployeeIDList(List<Employee> employeeList) {
        return employeeList.stream()
                .filter(employee -> employee.getNumberOfLeaves() > 25)
                .map(Employee::getEmployeeId).toList();
    }

    private String employeeDetail(Employee employee) {
        return employee.getNameOfEmployee().concat("-").concat(String.valueOf(employee.getNumberOfLeaves()));
    }

    public ArrayList<String> getNumberOfLeaves(List<Employee> employeeList) {
        return employeeList.stream().map(this::employeeDetail)
                .collect(Collectors.toCollection(ArrayList::new));
    }

}
