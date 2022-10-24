package dev.bestzige.bankaccount;

import java.util.Arrays;

public class BankAccount {

    private long accountId;
    private Person[] accountOwner;
    private double balance;
    private int accountOwnerCounting;

    public BankAccount(Person accountOwner, int numberOfAccountOwner, double balance) {
        this.accountId = accountOwner.getIdCard();
        this.accountOwner = new Person[numberOfAccountOwner];
        this.accountOwner[0] = accountOwner;
        this.balance = balance;
        this.accountOwnerCounting = numberOfAccountOwner <= 5 ? numberOfAccountOwner : 5;
    }

    /* ถ้ารับ Parameter เป็น Person น่าจะดีกว่าแต่อันนี้ทำตามโจทย์ */
    public void addAccountOwner(long idCard, String newFirstName, String newLastName) {
        for (int i = 0; i < accountOwner.length; i++) {
            if(accountOwner[i] == null) {
                accountOwner[i] = new Person(idCard, newFirstName, newLastName);
                break;
            }
        }
    }

    public long getAccountId() {
        return accountId;
    }

    public Person[] getAccountOwner() {
        return accountOwner;
    }

    public double getBalance() {
        return balance;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean transfer(BankAccount targetAccount, double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            targetAccount.deposit(amount);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountId=" + accountId +
                ", accountOwner=" + Arrays.toString(accountOwner) +
                ", balance=" + balance +
                ", accountOwnerCounting=" + accountOwnerCounting +
                '}';
    }
}
