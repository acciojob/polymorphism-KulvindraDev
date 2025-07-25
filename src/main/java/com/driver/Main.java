package com.driver;

class Product {
    public int product(int x, int y) {
        return x * y;
    }

    public int product(int x, int y, int z) {
        return x * y * z;
    }

    public double product(double x, double y) {
        return x * y;
    }
}

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        int result1 = p.product(5, 10);
        int result2 = p.product(5, 10, 15);
        double result3 = p.product(5.5, 10.5);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}