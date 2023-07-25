package com.codetalksdna.EncapsulationPrograms;

import java.util.Scanner;

public class CustomerInterface {
    public static void main(String[] args) {
        InternalBankingOperations internalBankingOperations = new InternalBankingOperations();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Account Number?");
        String bankAccountNumberGiven = scanner.nextLine();
        internalBankingOperations.setBankAccountNumber("123456");
        if (internalBankingOperations.getBankAccountNumber().equals(bankAccountNumberGiven)) {
            System.out.println("You are Authenticated , Please Enter the Amount you wish to deposit?");
            internalBankingOperations.setDepositAmount(scanner.nextInt());
            System.out.println("Your Transaction Of Depositing Money is Successful and Your Current Balance is" + " " + internalBankingOperations.getDepositAmount());
            System.out.println("Do you wish to Proceed Further or Do You Wish to Quit, Please Enter in Yes or No");
            String decision = scanner.next();
            if (decision.toUpperCase().equals("YES")) {
                System.out.println("Enter the amount you wish to Withdraw?");
                internalBankingOperations.setWithdrawAmount(scanner.nextInt());
            } else {
                System.out.println("Thanks for Banking with us");
            }
        } else {
            System.out.println("Please Check your account Number");
        }
    }
}





