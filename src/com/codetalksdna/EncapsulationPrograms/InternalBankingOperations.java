package com.codetalksdna.EncapsulationPrograms;

public class InternalBankingOperations {
    private String bankAccountNumber;
    private double withdrawAmount;
    private double depositAmount;

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        if (getDepositAmount() >= withdrawAmount) {
            System.out.println("Thanks for Banking with us,Please collect the cash after Lunch");
            System.out.println("Remaining Balance" + " " + (getDepositAmount() - withdrawAmount));
        } else {
            System.out.println("Your Balance is Low, Please try entering lower amount then your Available Balance");
        }
        this.withdrawAmount = withdrawAmount;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }
}
