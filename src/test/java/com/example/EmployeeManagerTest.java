package com.example;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
public class EmployeeManagerTest {

    @Test
    public void setUpNewEmployee() {
        Employee employee1 = new Employee("1", 20000, false);
        employee1.setId("1");
        employee1.setSalary(20000);
        employee1.setPaid(false);
        System.out.println("Running a test...");

    }

    @Test
    public void testShouldSaveAndReturnListWithAllEmployees() {
        EmployeeRepository employeeRepository = new EmployeeRepositoryStubReturnEmployees();
        Employee employee1 = new Employee("1", 20000);
        Employee employee2 = new Employee("2", 30000);
        employeeRepository.save(employee1);
        employeeRepository.save(employee2);
        Assertions.assertEquals(2, employeeRepository.findAll().size());

    }

    @Test
    public void testShouldFailIfAnyEmployeeHasSetPaidToFalse() {
        Employee employee1 = new Employee("1", 20000);
        employee1.setPaid(false); // change to true and test will pass
        Employee employee2 = new Employee("2", 30000);
        employee2.setPaid(true);
        Assertions.assertTrue(employee1.isPaid(), "Test will fail because employee1 has setPaid to false");
    }


}
