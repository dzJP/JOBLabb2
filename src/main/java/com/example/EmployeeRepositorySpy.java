package com.example;

import java.util.List;

public class EmployeeRepositorySpy implements EmployeeRepository {

    private List<Employee> employees;

    @Override
    public List<Employee> findAll() {
        return null;
    }

    @Override
    public Employee save(Employee e) {
        return null;
    }


}
