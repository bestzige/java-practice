package dev.bestzige.midterm;

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
        /* 2.1 */
        double xxx = 073D; /* งงล่ะสิว่า D คืออะไร D = double ไว้ใส่ให้มันถูกหลักๆเฉยๆ ถ้าไม่ใส่อาจมีข้อผิดพลาด */

        /* 2.2 */
        System.out.println(xxx);

        /* 2.3 */
        System.out.println(xxx + " meters is " + String.format("%.2f", watchara(xxx)) + " wah.");

        /* 2.4 */
        System.out.println(xxx + " yards is " + String.format("%.2f", watchara(santawee(xxx))) + " meters.");
    }
}
