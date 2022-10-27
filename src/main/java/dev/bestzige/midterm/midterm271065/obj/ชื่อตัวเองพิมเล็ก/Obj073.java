package obj.ชื่อตัวเองพิมเล็ก;

public class Obj[เลขสามตัว] {

    private static String id[เลขสามตัว];
    private String name[ชื่อตัวเองพิมใหญ่];
    private double value[เลขสามตัว];

    public Obj[เลขสามตัว](String id[เลขสามตัว], String name[ชื่อตัวเองพิมใหญ่], double value[เลขสามตัว]) {
        Obj[เลขสามตัว].id[เลขสามตัว] = id[เลขสามตัว];
        this.name[ชื่อตัวเองพิมใหญ่] = name[ชื่อตัวเองพิมใหญ่];
        this.value[เลขสามตัว] = value[เลขสามตัว];
    }

    public static String getId[เลขสามตัว]() {
        return id[เลขสามตัว];
    }

    public static void setId[เลขสามตัว](String id[เลขสามตัว]) {
        Obj[เลขสามตัว].id[เลขสามตัว] = id[เลขสามตัว];
    }

    public String getName[ชื่อตัวเองพิมใหญ่]() {
        return name[ชื่อตัวเองพิมใหญ่];
    }

    public void setName[ชื่อตัวเองพิมใหญ่](String name[ชื่อตัวเองพิมใหญ่]) {
        this.name[ชื่อตัวเองพิมใหญ่] = name[ชื่อตัวเองพิมใหญ่];
    }

    public double getValue[เลขสามตัว]() {
        return value[เลขสามตัว];
    }

    public void setValue[เลขสามตัว](double value[เลขสามตัว]) {
        this.value[เลขสามตัว] = value[เลขสามตัว];
    }

    @Override
    public String toString() {
        return "Obj[เลขสามตัว]{" +
                "name[ชื่อตัวเองพิมใหญ่]='" + name[ชื่อตัวเองพิมใหญ่] + '\'' +
                ", value[เลขสามตัว]=" + value[เลขสามตัว] +
                ", id[เลขสามตัว]=" + id[เลขสามตัว] +
                '}';
    }

    public static int compare(Obj[เลขสามตัว] o1, Obj[เลขสามตัว] o2) {
        if(o1.getValue[เลขสามตัว]() == o2.getValue[เลขสามตัว]()) return 0;
        if(o1.getValue[เลขสามตัว]() < o2.getValue[เลขสามตัว]()) return -1;
        return 1;
    }

    public boolean isGreaterThan(Obj[เลขสามตัว] o) {
        return this.getValue[เลขสามตัว]() > o.getValue[เลขสามตัว]();
    }
}
