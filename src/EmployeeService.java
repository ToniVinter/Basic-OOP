import entity.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService implements EmployeeInterface {
    @Override
    public List<Employee> getEmployeesOlderThan(List<Employee> employees, int age) {
        return employees.stream()
                .filter(e -> e.getContact().getAge() > age)
                .collect(Collectors.toList());
    }
}
