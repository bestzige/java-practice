package dev.bestzige.midtermbyagentranong;

public class Q01StaticMethod {

    /* 1.1 */
    private static double watchara(double lengthInMeters) {
        return lengthInMeters * 0.5;
    }

    /* 1.2 */
    private static double santawee(double lengthInYards) {
        return lengthInYards * 0.91;
    }

    /* 2 */
    public static void main(String[] args) {
        double meters = 55;
        double yards = 55;

        /* 2.1 */
        double lastThreeDigitsOfMyStudentId = 073D; /* งงล่ะสิว่า D คืออะไร D = double ไว้ใส่ให้มันถูกหลักๆเฉยๆ ถ้าไม่ใส่อาจมีข้อผิดพลาด */

        /* 2.2 */
        System.out.println(lastThreeDigitsOfMyStudentId);

        /* 2.3 */
        System.out.println(meters + " meters is " + String.format("%.2f", watchara(meters)) + " wah.");

        /* 2.4 */
        System.out.println(yards + " yards is " + String.format("%.2f", santawee(yards)) + " meters.");
    }
}
