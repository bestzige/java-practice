package mainpack;

import obj.[ชื่อตัวเองพิมเล็ก].Obj[เลขสามตัว];
import util.[ชื่อตัวเองพิมเล็ก].Util[เลขสามตัว];

public class Main[เลขสามตัว] {
    public static void main(String[] args) {
        test[ชื่อตัวเองพิมใหญ่]();

        testCompute[เลขสามตัว]RightTriangleArea();

        testEvaluate[เลขสามตัว]();

        testComputeMagic[ชื่อตัวเองพิมใหญ่]();

        testSetId[เลขสามตัว]();

        testSetName[ชื่อตัวเองพิมใหญ่]();

        testSetValue[เลขสามตัว]();

        testGetId[เลขสามตัว]();

        testGetName[ชื่อตัวเองพิมใหญ่]();

        testGetValue[เลขสามตัว]();

        testCompare();

        testToString();

        testIsGreaterThan();
    }

    private static void test[ชื่อตัวเองพิมใหญ่]() {
        Util[เลขสามตัว] util[เลขสามตัว] = new Util[เลขสามตัว]();
        System.out.println(util[เลขสามตัว].get[ชื่อตัวเองพิมใหญ่]());
    }

    private static void testCompute[เลขสามตัว]RightTriangleArea() {
        System.out.println(Util[เลขสามตัว].compute[เลขสามตัว]RightTriangleArea(18D, 28D));
    }

    private static void testEvaluate[เลขสามตัว]() {
        System.out.println(Util[เลขสามตัว].evaluate[เลขสามตัว](250D));
    }

    private static void testComputeMagic[ชื่อตัวเองพิมใหญ่]() {
        System.out.println(Util[เลขสามตัว].computeMagic[ชื่อตัวเองพิมใหญ่](2, 20, 4));
    }

    private static void testConstructor() {
        Obj[เลขสามตัว] me = new Obj[เลขสามตัว]("id[เลขสามตัว]", "[ชื่อตัวเองพิมใหญ่]", [เลขสามตัว]D);
        System.out.println(me);
    }

    private static void testSetId[เลขสามตัว]() {
        Obj[เลขสามตัว] me = new Obj[เลขสามตัว]("id[เลขสามตัว]", "[ชื่อตัวเองพิมใหญ่]", [เลขสามตัว]D);
        Obj[เลขสามตัว].setId[เลขสามตัว]("id[เลขสามตัว]");
        System.out.println(me);
    }

    private static void testSetName[ชื่อตัวเองพิมใหญ่]() {
        Obj[เลขสามตัว] me = new Obj[เลขสามตัว]("id[เลขสามตัว]", "[ชื่อตัวเองพิมใหญ่]", [เลขสามตัว]D);
        me.setName[ชื่อตัวเองพิมใหญ่]("[ชื่อตัวเองพิมใหญ่] Santawee");
        System.out.println(me);
    }

    private static void testSetValue[เลขสามตัว]() {
        Obj[เลขสามตัว] obj = new Obj[เลขสามตัว]("id[เลขสามตัว]", "[ชื่อตัวเองพิมใหญ่]", 000D);
        me.setValue[เลขสามตัว]([เลขสามตัว]D);
        System.out.println(obj);
    }

    private static void testGetId[เลขสามตัว]() {
        Obj[เลขสามตัว] obj = new Obj[เลขสามตัว]("id[เลขสามตัว]", "[ชื่อตัวเองพิมใหญ่]", [เลขสามตัว]D);
        System.out.println(Obj[เลขสามตัว].getId[เลขสามตัว]());
    }

    private static void testGetName[ชื่อตัวเองพิมใหญ่]() {
        Obj[เลขสามตัว] obj = new Obj[เลขสามตัว]("id[เลขสามตัว]", "[ชื่อตัวเองพิมใหญ่]", [เลขสามตัว]D);
        System.out.println(obj.getName[ชื่อตัวเองพิมใหญ่]());
    }

    private static void testGetValue[เลขสามตัว]() {
        Obj[เลขสามตัว] obj = new Obj[เลขสามตัว]("id[เลขสามตัว]", "[ชื่อตัวเองพิมใหญ่]", [เลขสามตัว]D);
        System.out.println(obj.getValue[เลขสามตัว]());
    }

    private static void testToString() {
        Obj[เลขสามตัว] obj = new Obj[เลขสามตัว]("id[เลขสามตัว]", "[ชื่อตัวเองพิมใหญ่]", [เลขสามตัว]D);
        System.out.println(obj.toString());
    }

    private static void testCompare() {
        Obj[เลขสามตัว] obj = new Obj[เลขสามตัว]("id[เลขสามตัว]", "[ชื่อตัวเองพิมใหญ่]", [เลขสามตัว]D);
        Obj[เลขสามตัว] mow = new Obj[เลขสามตัว]("id000", "ชื่อมั่ว", 000D);
        Obj[เลขสามตัว] rai = new Obj[เลขสามตัว]("id320", "ชื่อไร", 320D);
        System.out.println(Obj[เลขสามตัว].compare(obj, obj));
        System.out.println(Obj[เลขสามตัว].compare(obj, rai));
        System.out.println(Obj[เลขสามตัว].compare(obj, mow));
    }

    private static void testIsGreaterThan() {
        Obj[เลขสามตัว] obj = new Obj[เลขสามตัว]("id[เลขสามตัว]", "[ชื่อตัวเองพิมใหญ่]", [เลขสามตัว]D);
        Obj[เลขสามตัว] xd = new Obj[เลขสามตัว]("id200", "ชื่อไร", 200D);
        System.out.println(obj.isGreaterThan(xd));
        System.out.println(xd.isGreaterThan(obj));
        System.out.println(obj.isGreaterThan(obj));
    }
}
