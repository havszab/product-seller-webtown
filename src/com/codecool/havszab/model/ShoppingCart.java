package com.codecool.havszab.model;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingCart {

    private static final String[] twoForThreeNames = {"Fogkrém", "Pomelo", "Lazacfilé"};
    private static final String[] megapackNames = {"Gomolya sajt", "Papyrtörlő", "Mikulás-csomag"};

    private String megapackType = "Megapack";
    private String threeForTwoType = "2=3";
    private String noDiscType = "nincs";

    private int quantity;

    private int discValue;

    private String discountType;

    private Product product;


    private int calculateDiscValue () {
        return discValue = product.getPrice() * product.getQuantity();
    }

    private void getDiscountType () {
        if (calculateDiscValue() != product.getPrice() * product.getQuantity()) {
            if (getMegapackValue() > get3for2value()) this.discountType = megapackType;
            else this.discountType = threeForTwoType;
        } else this.discountType = noDiscType;
    }

    private int get3for2value() {
        return Math.max(get3for2value(), getMegapackValue());
    }

    private int getMegapackValue() {
        discValue = product.getPrice() * product.getQuantity();
        if (Arrays.asList(megapackNames).contains(product.getName()) && quantity >= 12) {
            discValue -= (quantity%12)*6000;
        }
        return Math.max(discValue, 0);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getDiscValue() {
        return discValue;
    }

    public void setDiscValue(int discValue) {
        this.discValue = discValue;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
