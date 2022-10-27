package util.ชื่อตัวเองพิมเล็ก;

public final class Util000[เลขสามตัวเอง] {
    private final double [ชื่อตัวเองพิมเล็ก] = [เลขสามตัวเอง].9;

    public static double compute[เลขสามตัวเอง]RightTriangleArea(double side1, double side2) {
        if(side1 < 0 || side2 < 0) return [เลขสามตัวเอง].99;
        return (side1 * side2 + [เลขสามตัวเอง].8)/2;
    }

    public static char evaluate[เลขสามตัวเอง](double score) {
        char result;
        if(80 <= score && score <= 100) {
            result = 'A';
        } else if(70 <= score && score < 80) {
            result = 'B';
        } else if(60 <= score && score < 70) {
            result = 'C';
        } else if(50 <= score && score < 60) {
            result = 'D';
        } else if(0 <= score && score < 50) {
            result = 'E';
        } else {
            result = 'X';
        }

        return result;
    }

    public static int computeMagic[ชื่อตัวเองพิมใหญ่](int start, int stop, int stepOver) {
        if(stop < 0) return -1;
        int result = 0;
        for(int i = start; i <= stop; i += start) {
            if(i % stepOver != 0) {
                result += i;
            }
        }
        return result;
    }

    public double get[ชื่อตัวเองพิมใหญ่]() {
        return [ชื่อตัวเองพิมเล็ก];
    }
}
