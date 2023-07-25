package com.codetalksdna.EncapsulationPrograms;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setBankAccountNumber("123456");
        customerEnters(bank.getBankAccountNumber());
    }

    private static void customerEnters(String bankAccountNumber) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Account Number?");
        String bankAccountNumberGiven = scanner.nextLine();
        if (bankAccountNumber.equals(bankAccountNumberGiven)) {
            System.out.println("Enter the Amount which needs to be deposited?");
            int depositedAmount = scanner.nextInt();
            double depositAmount = depositAmount(depositedAmount);
            if (depositedAmount > 0) {
                System.out.println("You Can Proceed Further,Please Enter the Amount to be withdrawn?");
                int withdrawAmount = scanner.nextInt();
                withdraw(withdrawAmount, depositAmount);
            }
        } else {
            System.out.println("You are not authenticated");
        }
    }

    private static void withdraw(int withdrawAmount, double depositAmount) {
        if (depositAmount >= withdrawAmount) {
            System.out.println("Thanks for Banking with us,Please collect the cash after Lunch");
            System.out.println("Remaining Balance" + " " + (depositAmount - withdrawAmount));
        } else {
            System.out.println("Your Balance is Low.");
        }
    }

    private static double depositAmount(double depositAmount) {
        Bank bank = new Bank();
        bank.setDepositAmount(depositAmount);
        return bank.getDepositAmount();
    }
}
