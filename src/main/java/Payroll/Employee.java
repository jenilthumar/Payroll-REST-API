package Payroll;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;


// Used entity annotation for database object creation named employee
@Entity
public class Employee {


    //attributes of employee class
    @Id // made id primary key using @Id annotation
    @GeneratedValue
    private long id;
    private String name;
    private String role;

    Employee() {
        // default constructor
    }

    Employee(String name, String role) {

        this.name = name;
        this.role = role;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return id == employee.id && Objects.equals(name, employee.name) && Objects.equals(role, employee.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, role);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
