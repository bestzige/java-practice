package dev.bestzige.midterm;

public class Santawee {

    public static void main(String[] args) {
        Watchara watchara = new Watchara(100, 100);
        System.out.println(watchara);
        watchara.setMassInGrams(555);
        watchara.setVolumeInCc(200);
        System.out.println(watchara);

        System.out.println("-----------------------");

        /* Test by density */
        Watchara watchara2 = new Watchara(0.5);
        System.out.println(watchara2);
        watchara.setMassInGrams(111);
        watchara.setVolumeInCc(222);
        System.out.println(watchara);
    }

}
