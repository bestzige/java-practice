package dev.bestzige;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        System.out.println(findMax(10, 5, 7));

        double x = 10.241124; int y = 20;
        String normal = "x is " + x + " y is " + y;
        /* %d = int, %.[number]f = double, float, %s = string */
        String format = String.format("x is %.2f y is %d", x, y);

        System.out.println(normal);

        System.out.println(format);

        System.out.println(product(5.0, 10.0, 1));

    }

    private static double findMax(double v1, double v2, double v3) {
        double result;
        if(v1 > v2 && v1 > v3) {
            result = v1;
        } else if(v2 > v1 && v2 > v3) {
            result = v2;
        } else {
            result = v3;
        }

        return result;
    }

    private static double product(double v1, double v2, int step) {
        // v1 * (v1 + step) * (v1 + step + step) * (v1 + step + step + step)
        double total = 1.0;

//        for(กำหนดค่า; เงื่อนไข; สิ่งที่จะทำ) {
//
//        }

        for(double i = v1; i <= v2; i += step) {
//            double x = i;
//            System.out.println(v1 + " * " + x + step);
            total *= i; // total = total * i;
        }

        return total;
    }

}
