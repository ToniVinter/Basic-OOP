package entity;

import java.util.List;

public class ItCompany extends Company {
    private final String codingLanguage;

    public ItCompany(List<Employee> employee, String codingLanguage) {
        super(employee);
        this.codingLanguage = codingLanguage;
    }

    public String getCodingLanguage() {
        return codingLanguage;
    }

    @Override
    public String toString() {
        return "ItCompany{" +
                "codingLanguage='" + codingLanguage + '\'' +
                '}';
    }
}
