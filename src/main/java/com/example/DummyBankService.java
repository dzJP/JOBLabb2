package com.example;

public class DummyBankService implements BankService {


    @Override
    public void pay(String id, double amount) {
        throw new RuntimeException("Not implemented dummy...");
    }
}
