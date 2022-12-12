package dev.bestzige.midterm;

public class Watchara {

    private double massInGrams;
    private double volumeInCc;
    /*
    ตามโจทย์ตรงนี้น่าจะใส่ final
    แต่มันย้อนแย้งกับข้อ 2.4
    ที่มันบอกว่าค่า density ต้องเปลี่ยนตาม mass และ volume
    กูเลยงงว่ามันต้องการอะไรหรือกูตีความหมายผิด
    ใครรู้ก็บอกด้วยละกันS
    */
    private double density;

    public Watchara(double massInGrams, double volumeInCc) {
        this.massInGrams = massInGrams;
        this.volumeInCc = volumeInCc;
        this.density = massInGrams / volumeInCc;
    }

    public Watchara(double density) {
        this.massInGrams = 0;
        this.volumeInCc = 0;
        this.density = density;
    }

    public double getMassInGrams() {
        return massInGrams;
    }

    public double getVolumeInCc() {
        return volumeInCc;
    }

    public double getDensity() {
        return density;
    }

    public void setMassInGrams(double massInGrams) {
        this.massInGrams = massInGrams;
        this.density = massInGrams / getVolumeInCc();
    }

    public void setVolumeInCc(double volumeInCc) {
        this.volumeInCc = volumeInCc;
        this.density = getMassInGrams() / volumeInCc;
    }

    @Override
    public String toString() {
        return "Watchara{" +
                "massInGrams=" + getMassInGrams() +
                ", volumeInCc=" + getVolumeInCc() +
                ", density=" + getDensity() +
                '}';
    }
}
