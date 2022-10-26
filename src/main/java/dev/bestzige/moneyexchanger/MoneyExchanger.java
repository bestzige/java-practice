package dev.bestzige.moneyexchanger;

public class MoneyExchanger {

    private double exchangeRate;
    private int foreignUnits;
    private int collectedBath;
    private int customerBath;

    public MoneyExchanger(double exchangeRate) {
        this.exchangeRate = exchangeRate;
        this.foreignUnits = 0;
        this.collectedBath = 0;
        this.customerBath = 0;
    }



}
