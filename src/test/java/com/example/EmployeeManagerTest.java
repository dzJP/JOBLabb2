package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.management.RuntimeErrorException;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;
@ExtendWith(MockitoExtension.class)
public class EmployeeManagerTest {

    @Test
    public void setUpNewEmployee() {

        Employee employee1 = new Employee("1",20000,false);
        employee1.setId("1");
        employee1.setSalary(20000);
        employee1.setPaid(false);

        Employee employee2 = new Employee("2", 30000);
        employee2.setId("2");
        employee2.setSalary(30000);

        System.out.println("Running a test...");

       }

    @Test
    public void testShouldFailIfAnyEmployeeHasSetPaidToFalse() {
        Employee employee1 = new Employee("1", 20000);
        employee1.setPaid(false); // change to true and test will pass
        Employee employee2 = new Employee("2",30000);
        employee2.setPaid(true);
//       EmployeeManager employeeManager = new EmployeeManager(new EmployeeRepositoryStubReturnEmployees(), new DummyBankService());

        Assertions.assertTrue(employee1.isPaid(),"Test will fail because employee1 has setPaid to false");
    }
}
