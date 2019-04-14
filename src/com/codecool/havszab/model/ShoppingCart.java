package com.codecool.havszab.model;


import java.util.Arrays;
import java.util.List;

public class ShoppingCart {

    private static final String[] threeForTwoNames = {"Fogkrém", "Pomelo", "Lazacfilé"};
    private static final String[] megapackNames = {"Gomolya sajt", "Papyrtörlő", "Mikulás-csomag"};

    private String megapackType = "Megapack";
    private String threeForTwoType = "2=3";
    private String noDiscType = "nincs";

    private int quantity;

    private int discValue;

    private String discountType;

    public ShoppingCart(int quantity) {
        this.quantity = quantity;
    }


    public int getDiscountedPriceForProducts(List<Product> products) {
        int priceIf2is3 = 0;
        int priceIfMega = 0;
        int simplePrice = 0;
        for (Product prod : products) {
            simplePrice += prod.getPrice() * quantity;
            priceIf2is3 += get3for2value(prod);
            priceIfMega += getMegapackValue(prod);
        }
        if (priceIf2is3 == simplePrice && priceIfMega == simplePrice) {
            this.discountType = noDiscType;
        } else if (priceIf2is3 > priceIfMega) {
            this.discountType = threeForTwoType;
            return priceIf2is3;
        } else if (priceIfMega >= priceIf2is3) {
            this.discountType = megapackType;
            return priceIfMega;
        }
        return simplePrice;
    }

    private int get3for2value(Product product) {
        discValue = product.getPrice() * quantity;
        if (Arrays.asList(threeForTwoNames).contains(product.getName()) && quantity >= 3) {
            discValue -= (quantity%3)*product.getPrice();
        }
        return discValue;
    }

    private int getMegapackValue(Product product) {
        discValue = product.getPrice() * quantity;
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


    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }

    public String getDiscountType() {
        return discountType;
    }
}
