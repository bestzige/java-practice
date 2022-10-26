package dev.bestzige.moneyexchanger;

public class MoneyExchanger {

    private double exchangeRate;
    private int foreignUnits;
    private int collectedBaht;
    private int customerBaht;

    public MoneyExchanger(int foreignUnits) {
        this.foreignUnits = foreignUnits;
        this.exchangeRate = 0;
        this.collectedBaht = 0;
        this.customerBaht = 0;
    }

    public MoneyExchanger(double exchangeRate) {
        this.exchangeRate = exchangeRate;
        this.foreignUnits = 0;
        this.collectedBaht = 0;
        this.customerBaht = 0;
    }

    public MoneyExchanger(double exchangeRate, int foreignUnits) {
        this.exchangeRate = exchangeRate;
        this.foreignUnits = foreignUnits;
        this.collectedBaht = 0;
        this.customerBaht = 0;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public int getForeignUnits() {
        return foreignUnits;
    }

    public int getCollectedBaht() {
        return collectedBaht;
    }

    public int getCustomerBath() {
        return customerBaht;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    @Override
    public String toString() {
        return "MoneyExchanger{" +
                "exchangeRate=" + exchangeRate +
                ", foreignUnits=" + foreignUnits +
                ", collectedBath=" + collectedBaht +
                ", customerBath=" + customerBaht +
                '}';
    }

    public void receiveForeignUnitsFromAdmin(int foreignUnits) {
        this.foreignUnits += foreignUnits;
    }

    public int giveAllCollectedBahtToAdmin() {
        int currentlyCollectedBaht = getCollectedBaht();
        this.collectedBaht = 0;
        return currentlyCollectedBaht;
    }

    public void receiveBahtFromCustomer(int baht) {
        this.customerBaht += baht;
    }

    public int exchangeToForeignUnitsForCustomer(int foreignUnits) {
        return 0;
    }

    public int returnBahtToCustomer() {
        return 0;
    }
}
