package com.example.factory;

import com.example.repository.AccountRepository;
import com.example.repository.NoSqlAccountRepository;
import com.example.repository.SqlAccountRepository;

// why factory-pattern?
// ---------------------
// isolate complexity of object-creation from dependent(s)

// factory-class
public class AccountRepositoryFactory {

    // factory-method
    public static AccountRepository getAccountRepository(String type) {
        if (type.equals("sql")) {
            return new SqlAccountRepository();
        } else if (type.equals("nosql")) {
            return new NoSqlAccountRepository();
        } else {
            throw new IllegalArgumentException("Invalid repository type");
        }
    }

}