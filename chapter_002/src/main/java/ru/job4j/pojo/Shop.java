package ru.job4j.pojo;

public class Shop extends Product {
    public static void main(String[] args) {
        Product products[] = new Product[3];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        Product arr = new Product();
        arr.delete(products, 1);
    }
}
