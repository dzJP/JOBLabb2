package com.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BankServiceTest {

    @Test
    public void testIfNoEmployees() {
        EmployeeManager employees = new EmployeeManager(new EmployeeRepository() {
            @Override
            public List<Employee> findAll() {
                return new ArrayList<>();
            }

            @Override
            public Employee save(Employee e) {
                return e;
            }
        }, new BankService() {
            @Override
            public void pay(String id, double amount) {
                throw new RuntimeException();
            }
        });
    }
}
