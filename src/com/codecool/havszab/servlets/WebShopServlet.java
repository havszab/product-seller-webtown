package com.codecool.havszab.servlets;

import com.codecool.havszab.DAO.Impl.ProductDAOImpl;
import com.codecool.havszab.DAO.ProductDAO;
import com.codecool.havszab.model.Product;
import com.codecool.havszab.model.ShoppingCart;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@WebServlet("/products")
public class WebShopServlet extends HttpServlet {

    private ProductDAO productDAO = new ProductDAOImpl();

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        System.out.println(request.getParameter("Fogkrém"));
    }


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Product> boughtProducts = new ArrayList<>();

        Product toothpaste = new Product("Fogkrém", 1195, readQuantity(request, "Fogkrém"));
        boughtProducts.add(toothpaste);

        Product pomelo = new Product("Pomelo", 349, readQuantity(request, "Pomelo"));
        boughtProducts.add(pomelo);

        Product salmon = new Product("Lazacfilé", 1290, readQuantity(request, "Lazacfilé"));
        boughtProducts.add(salmon);

        Product cheese = new Product("Gomolya sajt", 2290, readQuantity(request, "Gomolya sajt"));
        boughtProducts.add(cheese);

        Product towel = new Product("Papírtörlő", 449, readQuantity(request, "Papírtörlő"));
        boughtProducts.add(towel);

        Product pack = new Product("Mikulás-csomag", 1499, readQuantity(request, "Mikulás-csomag"));
        boughtProducts.add(pack);

        Product milk = new Product("Tej", 289, readQuantity(request, "Tej"));
        boughtProducts.add(milk);

        Product joghurt = new Product("Joghurt", 329, readQuantity(request, "Joghurt"));
        boughtProducts.add(joghurt);

        Product pasta = new Product("Száraztészta", 599, readQuantity(request, "Száraztészta"));
        boughtProducts.add(pasta);

        System.out.println(boughtProducts);

        ShoppingCart cart = new ShoppingCart(boughtProducts);
        cart.setDiscValue(cart.getDiscountedPriceForProducts());
        System.out.println("Default price: " + cart.getDefaultPrice());
        System.out.println(cart.getDiscountedPriceForProducts());
        System.out.println(cart.getDiscountType());
    }

    private int readQuantity(HttpServletRequest request, String name) {
        int result = 0;
        try {
            result = Integer.parseInt(request.getParameter(name));
        } catch (NumberFormatException e) {
            return 0;
        }
        return result;
    }

}
