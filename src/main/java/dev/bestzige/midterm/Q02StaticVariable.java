package dev.bestzige.midterm;

public class Q02StaticVariable {

    /* 1 */
    private static final double CONSTANT_VALUE = 2.529;

    /* 2.1 */
    private static double wat(double areaArces) {
        return areaArces * CONSTANT_VALUE;
    }

    /* 2.2 */
    private static double awee(double areaInRai) {
        return areaInRai / CONSTANT_VALUE;
    }

    /* 3 */
    public static void main(String[] args) {
        /* 3.1 */
        double xxx = 073D; /* งงล่ะสิว่า D คืออะไร D = double ไว้ใส่ให้มันถูกหลักๆเฉยๆ ถ้าไม่ใส่อาจมีข้อผิดพลาด */

        /* 3.2 */
        System.out.println(xxx);

        /* 3.3 */
        System.out.println(xxx + " rai is " + String.format("%.2f", awee(xxx)) + " arces.");

        /* 3.4 */
        System.out.println(xxx + " arces is " + String.format("%.2f", wat(xxx)) + " rai.");
    }
}
