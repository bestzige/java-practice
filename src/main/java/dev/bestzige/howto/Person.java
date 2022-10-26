package dev.bestzige.howto;

public class Person {

    /*
    ส่วนนี้คือ field หรือ attribute ของ class นี้
     โดยที่ field นี้จะเป็น private และมีชื่อเดียวกับชื่อ class -> ถ้าไม่อาจารย์ไม่กดหนดแนะนำให้เป็น private เสมอ ถ้ากำหนดมาก็ทำตามกำหนด
     โดยที่ static คือ ค่าที่เป็นค่าคงที่ และ final คือ ค่าที่ไม่สามารถเปลี่ยนแปลงได้
     ถ้าอาจารไม่กำหนดว่าคือ static ให้เราลบ static ออก
     และ final ก็เหมือนกัน
    */
    private static final String finalValue = "John";
    private String name;
    private int age;

    /* อันนี้เรียกว่า constructor หรือ method ที่จะทำงานเมื่อมีการสร้าง object ของ class นี้ */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /* อันนี้เรียกว่า getter หรือ method ที่จะทำงานเมื่อมีการเรียกใช้ค่าของ field นี้ */
    public String getName() {
        return name;
    }

    /* อันนี้เรียกว่า setter หรือ method ที่จะทำงานเมื่อมีการเปลี่ยนแปลงค่าของ field นี้ */
    public void setName(String name) {
        this.name = name;
    }

    /* อันนี้เรียกว่า toString หรือ method ที่จะทำงานเมื่อมีการแปลงค่าของ object นี้เป็น String */
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*
    โดยความลับของเราก็มี Key ลัดที่จะช่วยสร้าง Constructor, Getter, Setter, toString ได้เลย
    โดยการกด Alt + Insert แล้วเลือกที่ต้องการ แล้วก็กด Enter
    แต่พวก logic ก็ต้องเขียนเองนะ
    อย่าตลกทำตามเขาหมดนะ
    */

    public static void main(String[] args) {
        /*
        การสร้าง object
        โดยที่ Person คือชื่อ class ที่เราสร้างไว้
        และ new Person() คือการสร้าง object ของ class นั้นๆ
        */
        Person p1 = new Person("John", 20);

        /* การเรียกใช้ method getName() เพื่อที่จะได้รับชื่อของเขา */
        System.out.println(p1.getName());
        System.out.println(p1);

        /* เราเรียกใช้ method setName() เพื่อที่จะตั้งค่าชื่อใหม่ */
        p1.setName("Stupid");
        System.out.println(p1);
    }
}
