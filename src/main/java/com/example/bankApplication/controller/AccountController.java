package com.example.bankApplication.controller;

import com.example.bankApplication.model.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Map;

@RestController
public class AccountController {

    Account account = new Account(
            123456,
            "John Doe",
            new BigDecimal("3.5"),
            new BigDecimal("15000.00"),
            LocalDate.of(2020, 1, 1),
            "123-456-7890",
            "john.doe@example.com"
    );

    @GetMapping("/account/{accountNumber}/properties")
    public Map<String, Object> getAccountProperties(@PathVariable int accountNumber) {
        return account.printProperties();
    }
}
