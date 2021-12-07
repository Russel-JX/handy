package com.myfirm;

public class Main {

    private String name;
    private boolean gender;

    public static void main(String[] args) {
        Product product = new Product("keyboard");
        System.out.println("Hi, world! "+" product name is: "+product.getName());
    }

    @Override
    public String toString() {
        String newName = this.name;
        return super.toString();
    }

    public boolean isEmpty() {
        return name.isEmpty();
    }

    public void getF() {

    }
}
