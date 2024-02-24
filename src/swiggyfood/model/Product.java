package swiggyfood.model;

public class Product {
    private String type;
    private int price;

    public Product(String typr, int price) {
        this.type = type;
        this.price = price;
    }

    public String getTypr() {
        return type;
    }

    public int getPrice() {
        return price;
    }
}
