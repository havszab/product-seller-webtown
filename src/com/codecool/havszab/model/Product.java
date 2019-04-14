package com.codecool.havszab.model;

public class Product {

    private String name;

    private int price;

    private boolean hasThreeforTwo;

    private boolean hasMegapack;

    public Product() {
    }

    public Product(String name, int price, boolean hasThreeforTwo, boolean hasMegapack) {
        this.name = name;
        this.price = price;
        this.hasThreeforTwo = hasThreeforTwo;
        this.hasMegapack = hasMegapack;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isHasThreeforTwo() {
        return hasThreeforTwo;
    }

    public void setHasThreeforTwo(boolean hasThreeforTwo) {
        this.hasThreeforTwo = hasThreeforTwo;
    }

    public boolean isHasMegapack() {
        return hasMegapack;
    }

    public void setHasMegapack(boolean hasMegapack) {
        this.hasMegapack = hasMegapack;
    }
}
