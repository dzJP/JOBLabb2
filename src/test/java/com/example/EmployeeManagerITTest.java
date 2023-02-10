package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class EmployeeManagerITTest {

    private EmployeeManager employeeManager;
    private BankService bankService;
    EmployeeRepoInMemory employeeRepository = new EmployeeRepoInMemory(List.of
            (new Employee("1", 100000), new Employee("2", 200000)));


    @Test
    public void testPayingEmployees() {
        BankService bankService = mock(BankService.class);
        employeeManager = new EmployeeManager(new EmployeeRepoInMemory(new ArrayList<Employee>()),mock(BankService.class));
        doNothing().when(bankService).pay(anyString(),anyDouble());
        employeeManager.payEmployees();

    }

    @Test
    public void testShouldFindEmployeeAndReturnList() {
        var employee = employeeRepository.findAll().get(0);
        assertEquals("1", employee.getId());
        System.out.println("Employee picked from list was: " + employee + "\n" +
                "List contains: " + employeeRepository.employeeList);
    }

    @Test
    public void testSaveEmployeeToEmployeeList() {
        Employee employee3 = new Employee("3",300000);
        employeeRepository.save(employee3);
        Assertions.assertEquals(3, employeeRepository.findAll().size());
        System.out.println("Should contain 3 employees." + "\nList contains: " + employeeRepository.employeeList);

    }
}
