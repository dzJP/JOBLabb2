package com.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BankAccountTest {

    private BankAccount account;
    private static int count;

    @BeforeEach
    @Test
    public void beforeClass() {
        System.out.println("This executes before any test cases. Count = " + count++);
    }

    @BeforeEach
    @Test
    public void setUp() {
        account = new BankAccount("Pelle", "Svensson", 1000.00, BankAccount.CHECKING);
        System.out.println("Running a test...");

    }

    @Test
    public void deposit() {
        double balance = account.deposit(200.0, true);
        assertEquals(1200.00, balance, 0);
    }

    @Test
    public void withdraw_branch() {
        double balance = account.withdraw(600.00, true);
        assertEquals(400.00, balance, 0);
    }

    @Test()
    public void withdraw_notBranch() {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> {
            double balance = account.withdraw(600.00, false);
            assertEquals(400.00, balance, 0);
        });

    }

    @Test
    public void getBalance_deposit() {
        account.deposit(200.0, true);
        assertEquals(1200.00, account.getBalance(), 0);
    }

    @Test
    public void getBalance_withdraw() {
        account.withdraw(200.0, true);
        assertEquals(800.00, account.getBalance(), 0);
    }

    @Test
    public void isChecking_true() {
        assertTrue(account.isChecking(), "The account is NOT a checking account");
    }

    @AfterEach
    @Test
    public void afterClass() {
        System.out.println("This executes after any test cases.");
    }

//    @AfterEach
//    @Test
//    public void counter() {
//        System.out.println("Count = " + count++);
//    }
}

//    @Test
//    public void dummyTest() {
//        assertEquals(20,21);
//    }

