package ru.job4j.pojo;

public class Product {
    private String name;
    private int count;
    public Product() {

    }

    public Product(String name, int count) {
        this.name = name;
        this.count = count;
    }
    public Product[] delete(Product[] products, int index) {
        products[index] = null;
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (products[i] == null) {
                products[i] = products[index+1];
                products[index+1] = null;
            }
        } return products;


    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
