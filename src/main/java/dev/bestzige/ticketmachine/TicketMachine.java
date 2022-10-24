package dev.bestzige.ticketmachine;

import java.text.DecimalFormat;

public class TicketMachine {

    private double ticketPrice;
    private int numberOfTickets;
    private int numberOfCoins;
    private int customerCoins;

    public TicketMachine(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
        this.ticketPrice = 0;
        this.numberOfCoins = 0;
        this.customerCoins = 0;
        
    }

    public TicketMachine(double ticketPrice) {
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = 0;
        this.numberOfCoins = 0;
        this.customerCoins = 0;
    }

    public TicketMachine(double ticketPrice, int numberOfTickets) {
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
        this.numberOfCoins = 0;
        this.customerCoins = 0;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public int getNumberOfCoins() {
        return numberOfCoins;
    }

    public int getCustomerCoins() {
        return customerCoins;
    }

    @Override
    public String toString() {
        return "TicketMachine{" +
                "ticket price=" + String.format("%.2f", ticketPrice) + ", " +
                + numberOfTickets + " tickets, " +
                numberOfCoins + " coins, " +
                "customer " + customerCoins + " coins" +
                '}';
    }

    public void receiveTicketsFromAdmin(int ticket) {
        this.numberOfTickets += ticket;
    }

    public int giveAllCoinsToAdmin() {
        int currentlyCoins = getNumberOfCoins();
        this.numberOfCoins = 0;
        return currentlyCoins;
    }

    public void receiveCoinsFromCustomer(int coins) {
        this.customerCoins += coins;
    }

    public int sellTicketsToCustomer(int tickets) {
        int totalPrice = (int) Math.ceil((tickets * getTicketPrice()));
        if(getNumberOfTickets() < tickets) return -1;
        if(getCustomerCoins() < getTicketPrice() * tickets) return -2;

        int returnCoins = returnCoinsToCustomer() - totalPrice;
        this.numberOfTickets -= tickets;
        this.numberOfCoins += totalPrice;

        return returnCoins;
    }

    public int returnCoinsToCustomer() {
        int currentlyCoins = getCustomerCoins();

        this.customerCoins = 0;
        return currentlyCoins;
    }
}
