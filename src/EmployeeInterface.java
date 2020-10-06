import entity.Employee;

import java.util.List;

public interface EmployeeInterface {
    public List<Employee> getEmployeesOlderThan(List<Employee> employees, int age);
}
