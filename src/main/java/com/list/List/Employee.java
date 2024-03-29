package com.list.List;

import java.util.Objects;

public class Employee {
    private final String firstName;
    public String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String getFirstName() {

        return firstName;
    }

    public String getLastName() {

        return lastName;
    }

    @Override
    public boolean equals(Object employeer) {
        if (this == employeer) return true;
        if (employeer == null || getClass() != employeer.getClass()) return false;
        Employee employee = (Employee) employeer;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public String toString() {
        return "firstName:" + firstName +
                "lastName:" + lastName;
    }
}

