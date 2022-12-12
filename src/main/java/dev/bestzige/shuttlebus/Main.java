package dev.bestzige.shuttlebus;

public class Main {

    public static void main(String[] args) {
        testShuttleBusCase();
    }

    private static void testShuttleBusCase() {
        ShuttleBus sb = new ShuttleBus("B#001", 2400, 0);
        System.out.println(sb.getBusId());
        sb.closeFrontDoor();
        sb.closeRearDoor();
        System.out.println(sb);
        sb.openFrontDoor();
        sb.openRearDoor();
        System.out.println(sb);
        sb.lockDoors();
        System.out.println(sb);
        sb.addPassengers(10);
        System.out.println(sb);
        sb.go();
        System.out.println(sb);
        System.out.println(sb.getMoney());
        sb.resetMoney();
        System.out.println(sb);
        sb.setBusId("B#BESTZIGE");
        System.out.println(sb);
    }
}
