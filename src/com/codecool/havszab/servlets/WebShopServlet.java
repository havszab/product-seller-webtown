package com.codecool.havszab.servlets;

import com.codecool.havszab.DAO.Impl.ProductDAOImpl;
import com.codecool.havszab.DAO.ProductDAO;
import com.codecool.havszab.model.Product;

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
        Map requestData = request.getParameterMap();
        Iterator it = requestData.entrySet().iterator();
        List<Product> boughtProducts = new ArrayList<>();
        while (it.hasNext()) {
            Map.Entry prod = (Map.Entry) it.next();
            if (prod.getValue() != null) {
                System.out.println(prod.getKey() + ": " +prod.getValue().toString());
                //boughtProducts.add(new Product((String) prod.getKey(), Integer.parseInt((String) prod.getValue())));
            }
        }
        System.out.println(boughtProducts);
    }

}
