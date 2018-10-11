package com.kodilla.kodillam1p4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaM1p4Application {

    public static void main(String[] args) {
        SpringApplication.run(KodillaM1p4Application.class, args);

        ATM pko = new ATM();
        pko.transaction();
    }
}

abstract class Bank {

    abstract void infoBankWithdrawal();

    abstract void checkAccountBalance();

    abstract void rightToWithdraw();

    void ATMCardRequest() {
        System.out.println("Proszę włożyć kartę.");
    }

    void askForPIN() {
        System.out.println("Wprowadź PIN.");
    }

    void askForAmountToCashWithdraw() {
        System.out.println("Wprowadź wielkość gotówki do wypłaty.");
    }

    void cashWithdrawal() {
        System.out.println("Uwaga. Wypłacamy gotówkę.");
    }

    void sayThanks() {
        System.out.println("Dziękujemy za skorzystanie z naszych usług.");
    }

    void transaction() {
        ATMCardRequest();
        askForPIN();
        askForAmountToCashWithdraw();
        infoBankWithdrawal();
        checkAccountBalance();
        rightToWithdraw();
        cashWithdrawal();
        sayThanks();
    }
}

class ATM extends Bank {

    @Override
    void infoBankWithdrawal() {
        System.out.println("Klient chce wypłacić x.");
    }

    @Override
    void checkAccountBalance() {
        System.out.println("Sprawdzam stan konta...");
    }

    @Override
    void rightToWithdraw() {
        System.out.println("Masz wystarczające środki na koncie.");
    }
}
