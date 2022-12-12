package dev.bestzige.airconditioner;

public class Main {

    public static void main(String[] args) {
        testAirConditionerCase();
    }

    private static void testAirConditionerCase() {
        AirConditioner air = new AirConditioner(25, 0);

        /* Test turnAirOnOff() method */
        air.turnAirOnOff(); // ถ้าอยากปิดแอร์ ให้ใส่ comment ตรงนี้ไว้

        /* Test isAirOn() method */
        System.out.println("IsAirON: " + air.isAirOn());

        /* Test getTargetTemperature() method */
        System.out.println("Target Tempurature: " + air.getTargetTemperature());

        /* Test increaseTemperature() method */
        air.increaseTemperature();
        System.out.println("Increase Tempurature: " + air.getTargetTemperature());

        /* Test decreaseTemperature() method */
        air.decreaseTemperature();
        System.out.println("Decrease Tempurature: " + air.getTargetTemperature());

        /* Test decreaseTemperature() method */
        air.changeFanSpeed();

        /* Test toString() method */
        System.out.println(air);
    }
}
