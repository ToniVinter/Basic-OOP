package entity;

public class Employee {
    private final Contact contact;
    private final String job;

    public Employee(Contact contact, String job) {
        this.contact = contact;
        this.job = job;
    }

    public Contact getContact() {
        return contact;
    }

    public String getJob() {
        return job;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "contact=" + contact +
                ", job='" + job + '\'' +
                '}';
    }
}
