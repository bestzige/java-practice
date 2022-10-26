package dev.bestzige.howto;

public class Main {

    /*
    ตัวนี้จะเรียกว่า field หรือ attribute หรือ property หรือ instance variable
    โดยที่ private ---> คือ modifier ที่ใช้กำหนดว่า field นี้จะเป็น private หรือ public (โดยที่ public จะเป็น default ของ class ถ้าไม่ใส่อะไรเลย)
    และ static ---> คือ modifier ที่ใช้กำหนดว่า field นี้จะเป็น static หรือ non-static (โดยที่ static คือ field ที่เป็นของ class และ non-static คือ field ที่เป็นของ object)
    และ final ---> คือ modifier ที่ใช้กำหนดว่า field นี้จะเป็น final หรือ non-final (โดยที่ final คือค่าที่ไม่สามารถเปลี่ยนแปลงได้)
    และ int ---> คือ data type ที่ใช้กำหนดว่า field นี้จะเก็บข้อมูลประเภทไหน ในที่นี้คือ int จะมีตัวอื่นๆคือ (int, double, float, long, boolean, char, String, etc.)
    */
    private static final int numberTypeInteger = 10;

    /*
    เราจะสามารถสร้าง method main ได้โดยการพิมแบบเต็มๆหรือตัวย่อคือ psvm แล้วกด Tab
    method main() จะเป็น method ที่จะถูกเรียกใช้งานเมื่อเรารันโปรแกรม
    */
    public static void main(String[] args) {
        /* การเรียกใช้ method */
        testMethodInt(100);
        testMethodVoid("BestZige");

        System.out.println(testMethodInt(100));
        howToUseForLoop();
    }

    /*
    ************ ตัวอย่าง method ที่ไม่มีการรับค่าเข้ามาและไม่มีการ return ค่าออกไป ************

    ตัวนี้จะเรียกว่า method หรือ function หรือ procedure หรือ method หรือ instance method
    โดยที่ public ---> คือ modifier ที่ใช้กำหนดว่า method นี้จะเป็น public หรือ private (โดยที่ public จะเป็น default ของ class ถ้าไม่ใส่อะไรเลย)
    และ static ---> คือ modifier ที่ใช้กำหนดว่า method นี้จะเป็น static หรือ non-static (โดยที่ static คือ method ที่เป็นของ class และ non-static คือ method ที่เป็นของ object)
    และ void ---> คือ data type ที่ใช้กำหนดว่า method นี้จะ return ค่าอะไร ในที่นี้คือ void จะมีตัวอื่นๆคือ (int, double, float, long, boolean, char, String, etc.)
    และ testMethodVoid ---> คือชื่อของ method นี้
    และ (int name) ---> คือ parameter ที่ใช้รับค่าเข้ามาใน method นี้ โดยที่ String คือ data type ที่ใช้กำหนดว่า parameter นี้จะเก็บข้อมูลประเภทไหน ในที่นี้คือ int จะมีตัวอื่นๆคือ (int, double, float, long, boolean, char, String, etc.)
    และ name ---> คือชื่อของ parameter นี้
     */
    public static void testMethodVoid(String name) {
        System.out.println("Hello " + name + ", Welcome have room, have condom, have ky");
    }

    /*
    ************ ตัวอย่าง method ที่มีการ return ค่าออกไป ************

    ตัวนี้จะเรียกว่า method หรือ function หรือ procedure หรือ method หรือ instance method
    โดยที่ public ---> คือ modifier ที่ใช้กำหนดว่า method นี้จะเป็น public หรือ private
    และ static ---> คือ modifier ที่ใช้กำหนดว่า method นี้จะเป็น static หรือ non-static
    และ int ---> คือ data type ที่ใช้กำหนดว่า method นี้จะ return ค่าอะไร ในที่นี้คือ int จะมีตัวอื่นๆคือ (int, double, float, long, boolean, char, String, etc.)
    และ testMethodInt ---> คือชื่อของ method นี้
    และ (int number) ---> คือ parameter ที่ใช้รับค่าเข้ามาใน method นี้ โดยที่ int คือ data type ที่ใช้กำหนดว่า parameter นี้จะเก็บข้อมูลประเภทไหน ในที่นี้คือ int จะมีตัวอื่นๆคือ (int, double, float, long, boolean, char, String, etc.)
    และ number ---> คือชื่อของ parameter นี้
    */
    public static int testMethodInt(int number) {
        return number; /* ค่าที่ return ออกไปต้องเป็นชนิดเดียวกับ data type ใน method ที่ตั้งไว้*/
    }

    public static void howToUseForLoop() {
        /*
        การใช้ for loop ในการวนซ้ำ
            for(ตัวแปรเริ่มต้น; เงื่อนไข; การเปลี่ยนแปลงตัวแปรเริ่มต้น) {
                คำสั่งที่ต้องการให้ทำซ้ำ
            }
            ค่าที่ได้ก็คือ:
            i = 10
            i = 9
            i = 8
            i = 7
            i = 6
            i = 5
            i = 4
            i = 3
            i = 2
            i = 1
        */

        for(int i = 10; i > 0; i--) {
            System.out.println("i = " + i);
        }
    }

}
