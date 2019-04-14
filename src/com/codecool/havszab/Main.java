package com.codecool.havszab;

import com.codecool.havszab.DAO.Impl.ProductDAOImpl;

public class Main {

    public static void main(String[] args) {
        ProductDAOImpl productDAO = new ProductDAOImpl();
        System.out.println(productDAO.getAllProducts());
    }
}
