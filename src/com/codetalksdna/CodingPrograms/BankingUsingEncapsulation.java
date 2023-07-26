package com.codetalksdna.CodingPrograms;

import java.util.Scanner;

public class BankingUsingEncapsulation {
    private String accNumber;
    private Double amountToBeWithDrawn;
    private Double amountToBeDeposited;
    Scanner scanner = new Scanner(System.in);

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
        System.out.println("Please enter your account number:");
        String accNumber1 = scanner.nextLine();
        if (accNumber1.equalsIgnoreCase(accNumber)) {
            System.out.println("User details are valid, please proceed further");
            System.out.println("Would you like to deposit money to your account, type yes or no");
            if(scanner.nextLine().equalsIgnoreCase("YES")){
                System.out.println("Enter the amount to be deposited");
                setAmountToBeDeposited(scanner.nextDouble());
            }else{
                System.out.println("Thank you for banking with us");
            }
        } else {
            System.out.println("User details entered are wrong, please check");
        }
    }

    public Double getAmountToBeWithDrawn() {
        return amountToBeWithDrawn;
    }

    public void setAmountToBeWithDrawn(Double amountToBeWithDrawn) {
        if (amountToBeWithDrawn > 0){
            this.amountToBeWithDrawn = amountToBeWithDrawn;
            if (getAmountToBeDeposited() >= getAmountToBeWithDrawn()) {
                this.amountToBeDeposited = getAmountToBeDeposited() - getAmountToBeWithDrawn();
                System.out.println("Please collect the cash");
                System.out.println("Current account balance is: "+getAmountToBeDeposited());
            } else {
                System.out.println("Your account balance is too low to withdraw the amount");
            }
        }else{
            System.out.println("Please enter withdraw amount greater than zero");
            setAmountToBeWithDrawn(scanner.nextDouble());
        }

    }

    public Double getAmountToBeDeposited() {
        return amountToBeDeposited;
    }

    public void setAmountToBeDeposited(Double amountToBeDeposited) {
        if(amountToBeDeposited > 0){
            this.amountToBeDeposited = amountToBeDeposited;
            System.out.println("Money got deposited");
            System.out.println("Current account balance is: "+getAmountToBeDeposited());
            System.out.println("Would you like to withdraw money from your account, type yes or no");
            Scanner s1 = new Scanner(System.in);
            String data = s1.nextLine();
            if(data.equalsIgnoreCase("YES")){
                System.out.println("Please enter the amount to be withdrawn");
                setAmountToBeWithDrawn(scanner.nextDouble());
            }else{
                System.out.println("Thank you for depositing with us");
            }
        }else{
            System.out.println("Please enter deposit amount greater than zero");
            setAmountToBeDeposited(scanner.nextDouble());
        }
    }
}
