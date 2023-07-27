package com.codetalksdna.CodingPrograms;

import java.util.Scanner;

public class BankAccountEncapsulationMain {
    public static void main(String[] args) {
        BankAccountEncapsulation bankAccountEncapsulation = new BankAccountEncapsulation();
        bankAccountEncapsulation.setBalance(122323434);
        bankAccountEncapsulation.setAccNumber("wsx2334");
        System.out.println(bankAccountEncapsulation.getBalance() +", "+ bankAccountEncapsulation.getAccNumber());
    }
}
