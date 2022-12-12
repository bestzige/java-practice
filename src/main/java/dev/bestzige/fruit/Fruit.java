package dev.bestzige.fruit;

public class Fruit {

    private String name;
    private double price;
    private int quality;

    public Fruit(String name, double price, int quality) {
        /* Name Validation */
        if(name == null) {
            this.name = "";
        } else {
            this.name = name;
        }

        /* Price Validation */
        if(price <= 0.0D) {
            this.price = 0.0D;
        } else {
            this.price = price;
        }

        /* Quality Validation */
        if(quality <= 0) {
            this.quality = 1;
        } else if(quality >= 10) {
            this.quality = 10;
        } else {
            this.quality = quality;
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuality() {
        return quality;
    }

    public String toString() {
        return name + " (price:" + price + ", quality:" + quality + ")" ;
    }

    public boolean equals(Fruit f) {
        return this.name.equals(f.getName()) && this.price == f.getPrice() && this.quality == f.getQuality();
    }

    public int compareTo(Fruit f) {
        if(f == null) return 1;

        if(this.getQuality() > f.getQuality()) return 1;
        if(this.getQuality() < f.getQuality()) return -1;

        return 0;
    }
}
