package dev.bestzige.box3d;

public class Box3D {

    private double width;
    private double length;
    private static double height;
    private static String color;

    public Box3D(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public static double getHeight() {
        return height;
    }

    public static void setHeight(double height) {
        Box3D.height = height;
    }

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        Box3D.color = color;
    }

    @Override
    public String toString() {
        return "Box3D{" +
                "width=" + width +
                ", length=" + length +
                ", height=" + height +
                ", color=" + color +
                '}';
    }

    // ปริมาตร width * length * height -> return double(DataType)
    /*
        public คือ สถานะ function(method)
        double คือ ชนิดของค่าที่จะส่งกลับมาเมื่อเรียกใช้งาน method
        computeVolume คือ ชื่อ method
    */
    public double computeVolume() {
        return width * length * height;
    }

    public boolean canCover(Box3D box) {
        /*
            width, length
            (a b) -> a canCover b;
            a > b;
            return ย้อนกลับ
        */

        /* Pattern 1
        if(this.getWidth() < box.getWidth()) {
            return false;
        }

        if(this.getLength() < box.getLength()) {
            return false;
        }
        */

        return (this.getWidth() > box.getWidth() && this.getLength() > box.getLength());
    }
}
