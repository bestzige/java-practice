package dev.bestzige.shuttlebus;

public class ShuttleBus {

    /*
        frontDoor & rearDoor
        0 = opend
        1 = closed
        2 = locked
    */
    private String busId;
    private int frontDoor;
    private int rearDoor;
    private int noOfPassengers;
    private int odometer;
    private int money;

    public ShuttleBus() {}

    public ShuttleBus(String busId) {
        this.busId = busId;
        this.odometer = 2400;
        this.money = 0;
        this.frontDoor = 2;
        this.rearDoor = 2;
        this.noOfPassengers = 7;
    }

    public ShuttleBus(String busId, int odometer) {
        this.busId = busId;
        this.odometer = odometer;
        this.money = 0;
        this.frontDoor = 2;
        this.rearDoor = 2;
        this.noOfPassengers = 7;
    }

    public ShuttleBus(String busId, int odometer, int money) {
        this.busId = busId;
        this.odometer = odometer;
        this.money = money;
        this.frontDoor = 2;
        this.rearDoor = 2;
        this.noOfPassengers = 7;
    }

    public String getBusId() {
        return busId;
    }

    public void setBusId(String busId) {
        this.busId = busId;
    }

    public void closeFrontDoor() {
        this.frontDoor = 1;
    }

    public void openFrontDoor() {
        this.frontDoor = 0;
    }

    public void closeRearDoor() {
        this.rearDoor = 1;
    }

    public void openRearDoor() {
        this.rearDoor = 0;
    }

    public void lockDoors() {
        this.frontDoor = 2;
        this.rearDoor = 2;
    }

    public void addPassengers(int passengers) {
        incrementMoney(passengers * 7);
        this.noOfPassengers += passengers;
    }

    public void incrementMoney(int money) {
        this.money += money;
    }

    public int getMoney() {
        return money;
    }

    public void go() {
        incrementOdometer();
    }

    public void incrementOdometer() {
        this.odometer += 800;
    }

    public void resetMoney() {
        this.money = 0;
    }

    /* ไม่มีในโจทย์แต่เอาไว้ Debug ค่า */

    @Override
    public String toString() {
        return "ShuttleBus{" +
                "busId='" + busId + '\'' +
                ", frontDoor=" + frontDoor +
                ", rearDoor=" + rearDoor +
                ", noOfPassengers=" + noOfPassengers +
                ", odometer=" + odometer +
                ", money=" + money +
                '}';
    }
}
