package com.example;

import java.util.List;

public class EmployeeRepositoryWithEmptyResults implements EmployeeRepository { // Mock / Stub
    @Override
    public List<Employee> findAll() {
        return List.of();
    }

    @Override
    public Employee save(Employee e) {
        return e;
    }
}
