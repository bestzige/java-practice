package dev.bestzige.fruit;

public class Main {

    public static void main(String[] args) {
        testFruitCase();
    }

    private static void testFruitCase() {
        Fruit a = new Fruit("Apple", 150.9D, 10);
        Fruit b = new Fruit("Banana", 48.52D, 6);

        System.out.println(a);
        System.out.println(a.equals(b));
        System.out.println(a.compareTo(b));

        FruitCollection fc = new FruitCollection(2);
        fc.addFruit("Cherry", 85.179D, 8);
        fc.addFruit("Date", 94.62D, 9);
        fc.expand(1);
        fc.addFruit("Kiwi", 64.93D, 7);
        int s = fc.searchForFruitName("Date");
        if(s>=0) {
            System.out.println(fc.getFruitAt(s));
        }
    }
}
