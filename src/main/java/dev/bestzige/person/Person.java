package dev.bestzige.person;

public class Person {

    private String name;
    private int age;
    private String gender;

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();

        person1.name = "Somchai";
        person2.name = "Somying";
        person3.name = "Somjai";
        person4.name = "Somyut";

        System.out.println(person1.name);
        System.out.println(person2.name);
        System.out.println(person3.name);
        System.out.println(person4.name);
    }

    public Person() {
    }
}
