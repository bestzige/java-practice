package dev.bestzige.box3d;

public class Main {

    public static void main(String[] args) {
        testBox3D();
    }

    private static void testBox3D() {
        /*
        Box3D Class -> blueprint
         */
        Box3D firstBox = new Box3D(10, 20); // ค่าตอนแรก

        Box3D secondBox = new Box3D(5, 10);

        firstBox.canCover(secondBox); // true

        Box3D.setHeight(100);
        Box3D.setColor("BlueRedGreen");

        secondBox.setWidth(100);
        firstBox.setLength(100);

        System.out.println("1st Box Width: " + firstBox.getWidth());
        System.out.println("2nd Box Width: " +secondBox.getWidth());

        System.out.println("1st Box Length: " + firstBox.getLength());
        System.out.println("2nd Box Length: " + secondBox.getLength());

        System.out.println("firstBox String: " + firstBox.toString());
        System.out.println("secondBox String: " + secondBox.toString());

        System.out.println("1st canCover 2nd : " + firstBox.canCover(secondBox));
    }

}
