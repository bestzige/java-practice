package dev.bestzige.midtermbyagentranong;

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
        double areaInRai = 55;
        double areaInArces = 55;

        /* 3.1 */
        double lastThreeDigitsOfMyStudentId = 073D; /* งงล่ะสิว่า D คืออะไร D = double ไว้ใส่ให้มันถูกหลักๆเฉยๆ ถ้าไม่ใส่อาจมีข้อผิดพลาด */

        /* 3.2 */
        System.out.println(lastThreeDigitsOfMyStudentId);

        /* 3.3 */
        System.out.println(areaInRai + " rai is " + String.format("%.2f", awee(areaInRai)) + " arces.");

        /* 3.4 */
        System.out.println(areaInArces + " arces is " + String.format("%.2f", wat(areaInArces)) + " rai.");
    }
}
