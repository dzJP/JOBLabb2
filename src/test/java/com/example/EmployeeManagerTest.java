package com.example;

import org.junit.jupiter.api.Test;

public class EmployeeManagerTest {
    @Test
    public void setUpNewEmployee() {
        Employee employee1 = new Employee("1", 20000);
        employee1.setId("1");
        employee1.setSalary(20000);
        employee1.setPaid(false);

        Employee employee2 = new Employee("2", 30000);
        employee2.setId("2");
        employee2.setSalary(30000);
        employee2.setPaid(true);

        System.out.println("Running a test...");

    }
}
