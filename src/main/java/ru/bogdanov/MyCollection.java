package ru.bogdanov;

import java.util.Arrays;

public class MyCollection<T> {

    private Object[] mass = new Object[10];

    private int size = 0;

    public MyCollection() {
    }

    public void add(T element) {
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
