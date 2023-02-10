package com.example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepoInMemory implements EmployeeRepository {
    List<Employee> employeeList = new ArrayList<>();

    public EmployeeRepoInMemory(List<Employee> employeeList) {
        this.employeeList.addAll(employeeList);
    }

    @Override
    public List<Employee> findAll() {
        return employeeList;
    }

    @Override
    public Employee save(Employee empl) {
        employeeList.removeIf(employee -> employee.getId().equals(empl.getId()));
        employeeList.add(empl);
        return empl;
    }


}
