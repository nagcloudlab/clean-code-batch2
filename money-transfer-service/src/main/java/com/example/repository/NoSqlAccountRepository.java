package com.example.repository;

import org.apache.log4j.Logger;

import com.example.model.Account;

public class NoSqlAccountRepository implements AccountRepository {

    private static final Logger logger = Logger.getLogger("mts");

    public NoSqlAccountRepository() {
        logger.info("NoSQLAccountRepository instance created!");
    }

    public Account loadAccount(String number) {
        logger.info("Loading account with number " + number);
        return new Account(number, 1000.00);
    }

    public void updateAccount(Account account) {
        logger.info("Updating account with number " + account.getNumber());
    }

}
