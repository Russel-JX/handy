package com.myfirm;

public class Product {

    private static String name;
    private int size;

    public Product(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
}
