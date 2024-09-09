package com.example.service;

import org.apache.log4j.Logger;

import com.example.model.Account;
import com.example.repository.AccountRepository;

/*
 * 
 *  design issues
 *  --------------
 *  
 *  -> tight-coupling b/w dependent & dependency
 *      -> can't extend or replace with new features
 *  -> unit-testing not possible
 *      -> dev & bug-fixing complex
 * 
 *  performance issues
 * -------------------
 * 
 * -> too many dependencies created & destroyed
 *      -> slow, memory, resource consumption
 * 
 * 
 * why these issues?
 * 
 * -> dependent itself creating dependency
 * 
 * solution:
 * 
 * -> don't create dependency in dependent , do lookup on factory
 * 
 * limitation on factory-lookup:
 * 
 * -> factory-location tight-coupling, can't replace factory
 * 
 * best-solution:
 * 
 * -> don't create/lookup , inject by 'third-party' ( IOC -> Inversion of Control )
 * 
 */

public class UPITransferService implements TransferService {

    private static final Logger logger = Logger.getLogger("mts");

    private AccountRepository accountRepository;

    public UPITransferService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository; // dependency injection
        logger.info(
                accountRepository.getClass().getName() + "-accountRepository injected to UPITransferService instance!");
        logger.info("UPITransferService instance created!");
    }

    public void transfer(String fromAccountNumber, String toAccountNumber, double amount) {

        logger.info("Transfer initiated from " + fromAccountNumber + " to " + toAccountNumber + " amount " + amount);

        // SQLAccountRepository accountRepository = new SQLAccountRepository(); //
        // creating dependency by itself

        // AccountRepository accountRepository =
        // AccountRepositoryFactory.getAccountRepository("sql");// lookup factory

        Account fromAccount = accountRepository.loadAccount(fromAccountNumber);
        Account toAccount = accountRepository.loadAccount(toAccountNumber);

        fromAccount.setBalance(fromAccount.getBalance() - amount);
        toAccount.setBalance(toAccount.getBalance() + amount);

        accountRepository.updateAccount(fromAccount);
        accountRepository.updateAccount(toAccount);

        logger.info("Transfer completed!");

    }
}
