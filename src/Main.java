import entity.Company;
import entity.Contact;
import entity.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static Company init() {
        Employee employee = new Employee(new Contact("Popescu", 24, "Romania"), "Java developer");
        Employee employee1 = new Employee(new Contact("Marin", 19, "Romania"), "Swift developer");
        List<Employee> employees = Arrays.asList(employee, employee1);
        return new Company(employees);
    }

    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
        Company company = init();
        System.out.println(company);
        System.out.println(employeeService.getEmployeesOlderThan(company.getEmployee(), 20));

    }

}
