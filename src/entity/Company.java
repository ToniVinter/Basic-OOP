package entity;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private final List<Employee> employee;

    public Company(List<Employee> employee) {
        this.employee = new ArrayList<>(employee);
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    @Override
    public String toString() {
        return "Company{" +
                "employee=" + employee +
                '}';
    }


}
