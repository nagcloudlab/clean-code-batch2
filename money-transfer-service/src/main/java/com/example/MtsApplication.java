package com.example;

import com.example.factory.AccountRepositoryFactory;
import com.example.repository.AccountRepository;
import com.example.service.TransferService;
import com.example.service.UPITransferService;

public class MtsApplication {

    public static void main(String[] args) {

        System.out.println("-".repeat(50));
        // ---------------------------------------------
        // init / boot phase
        // ---------------------------------------------
        // create appln's components & wire them together
        AccountRepository sqlAccountRepository = AccountRepositoryFactory.getAccountRepository("sql"); // dependency
        AccountRepository nosqlAccountRepository = AccountRepositoryFactory.getAccountRepository("nosql"); // dependency
        TransferService upiTransferService = new UPITransferService(sqlAccountRepository); // dependent

        System.out.println("-".repeat(50));
        // ---------------------------------------------
        // // use / runtime phase
        // ---------------------------------------------
        // execute appln's logic

        upiTransferService.transfer("1", "2", 100.00);
        System.out.println();
        upiTransferService.transfer("2", "1", 50.00);

        System.out.println("-".repeat(50));
        // ---------------------------------------------
        // shutdown phase
        // ---------------------------------------------
        // release resources
        System.out.println("-".repeat(50));

    }
}
