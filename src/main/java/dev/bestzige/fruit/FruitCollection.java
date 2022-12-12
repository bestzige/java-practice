package dev.bestzige.fruit;

import java.util.Arrays;

public class FruitCollection {

    private Fruit[] fruits;
    private int count;

    public FruitCollection(int size) {
        if(size < 1) {
            this.count = 1;
        } else {
            this.count = size;
        }
    }

    public int getCount() {
        return count;
    }

    public boolean isFull() {
        return getCount() == (fruits == null ? 0 : fruits.length);
    }

    public boolean addFruit(String name, double price, int quality) {
        if(isFull()) return false;
        if(price <= 0.0D) return false;
        if(quality < 0 || quality > 10) return false;

        if(fruits == null) {
            fruits = new Fruit[getCount()];
        }

        fruits[getCount() - fruits.length] = new Fruit(name, price, quality);
        count++;
        return true;
    }

    public Fruit getFruitAt(int slot) {
        if(slot < 0 || slot >= fruits.length) return null;

        return fruits[slot];
    }

    public boolean expand(int size) {
        if(size < 1) return false;

        if(fruits == null) {
            fruits = new Fruit[size];
            return true;
        }

        count += size;
        fruits = Arrays.copyOf(fruits, fruits.length + size);
        return true;
    }

    public int searchForFruitName(String name) {
        if(name == null || fruits == null) return -1;

        for(int i = 0; i < fruits.length; i++) {
            if(fruits[i].getName().equals(name)) {
                return i;
            }
        }

        return -1;
    }

    /* ในโจทย์ไม่มีแต่เอาไว้ Debug ค่า */
    public String toString() {
        return Arrays.toString(fruits);
    }
}
