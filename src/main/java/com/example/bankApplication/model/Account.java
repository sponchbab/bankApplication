package com.example.bankApplication.model;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Account {
    // properties
    private int accountNumber;
    private String longName;
    private BigDecimal interestRate;
    private BigDecimal balance;
    private LocalDate openDate;
    private String phoneNumber;
    private String emailAddress;

    //constructor
    public Account(int accountNumber, String longName, BigDecimal interestRate, BigDecimal balance, LocalDate openDate, String phoneNumber, String emailAddress) {
        this.accountNumber = accountNumber;
        this.longName = longName;
        this.interestRate = interestRate;
        this.balance = balance;
        this.openDate = openDate;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    //method 1 get summary
    public void displaySummary() {
        System.out.println("com.example.bankApplication.model.Account Number: " + accountNumber);
        System.out.println("com.example.bankApplication.model.Account Holder: " + longName);
        System.out.println("Current Interest Rate: " + interestRate);
        System.out.println("Current Balance: " + balance);
        System.out.println("com.example.bankApplication.model.Account Open Date: " + openDate);
    }

    public void getContact() {
        System.out.println("com.example.bankApplication.model.Account Holder:" + longName);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email Address: " + emailAddress);
    }
    public Map<String, Object> printProperties() {
        Map<String, Object> properties = new HashMap<>();
        Class<?> clazz = this.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);  // Allow access to private fields
            try {
                Object value = field.get(this);
                properties.put(field.getName(), value);
            } catch (IllegalAccessException e) {
                properties.put(field.getName(), "Could not access");
            }
        }
        return properties;  // Return the properties as a Map
    }
}