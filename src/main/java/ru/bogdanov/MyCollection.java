package ru.bogdanov;

import java.util.Arrays;

public class MyCollection<T> {

    private Object[] mass = new Object[10];

    private int size = 0;

    public MyCollection() {
    }

    public void add(T element) {
        int length = mass.length;
        if (size == length - 1) {
            Object[] newMass = new Object[length * 2];
            System.arraycopy(mass, 0, newMass, 0, mass.length);
            mass = newMass;
        }
        mass[size] = element;
        size++;
    }

    public Object[] getMass() {
        return mass;
    }

    public void setMass(Object[] mass) {
        this.mass = mass;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "MyCollection{" +
                "mass=" + Arrays.toString(mass) +
                '}';
    }
}
