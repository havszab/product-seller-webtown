package com.codecool.havszab.servlets;

import com.codecool.havszab.DAO.Impl.ProductDAOImpl;
import com.codecool.havszab.DAO.ProductDAO;
import com.codecool.havszab.model.Product;
import com.codecool.havszab.model.ShoppingCart;

import javax.servlet.RequestDispatcher;
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

    public WebShopServlet() {
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


        ShoppingCart cart = new ShoppingCart(boughtProducts);

        int defaultPrice = cart.getDefaultPrice();
        int discountedPrice = cart.getDiscValue();
        String type = cart.getDiscountType();

        System.out.println("Eredeti ár " + defaultPrice);
        System.out.println("Kedvezményes ár: " + discountedPrice);
        System.out.println("Kedvezmény típusa: " + type);

        request.setAttribute("toothpaste", toothpaste.getQuantity());
        request.setAttribute("pomelo", pomelo.getQuantity());
        request.setAttribute("salmon", salmon.getQuantity());
        request.setAttribute("cheese", cheese.getQuantity());
        request.setAttribute("towel", towel.getQuantity());
        request.setAttribute("pack", pack.getQuantity());
        request.setAttribute("milk", milk.getQuantity());
        request.setAttribute("joghurt", joghurt.getQuantity());
        request.setAttribute("pasta", pasta.getQuantity());
        request.setAttribute("defaultPrice", defaultPrice);
        request.setAttribute("discountedPrice", discountedPrice);
        request.setAttribute("type", type);

        RequestDispatcher dispatcher = request.getRequestDispatcher("overview.jsp");
        dispatcher.forward(request, response);

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
