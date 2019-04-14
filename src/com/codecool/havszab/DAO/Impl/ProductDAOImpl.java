package com.codecool.havszab.DAO.Impl;

import com.codecool.havszab.DAO.ProductDAO;
import com.codecool.havszab.model.Product;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductDAOImpl implements ProductDAO {

    String toReplace ="\"";

    @Override
    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("resources/products.csv"))) {
            List<String> currentLineContent;
            int rowNum = 0;
            while (scanner.hasNextLine()) {
                currentLineContent = getRecordFromLine(scanner.nextLine());
                for (int i = 0; i < currentLineContent.size(); i++) {
                    String currentWord = currentLineContent.get(i);
                    String newWord = currentWord.replaceAll(toReplace, "");
                    currentLineContent.set(i, newWord);
                }
                if (rowNum != 0) {
                    Product currentProduct = new Product(
                            currentLineContent.get(0),
                            Integer.parseInt(currentLineContent.get(1)),
                            currentLineContent.get(2).equals("X"),
                            currentLineContent.get(3).equals("X")
                    );
                    products.add(currentProduct);
                }
                rowNum++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return products;
    }

    private List<String> getRecordFromLine(String line) {
        List<String> values = new ArrayList<String>();
        try (Scanner rowScanner = new Scanner(line)) {
            rowScanner.useDelimiter(",");
            while (rowScanner.hasNext()) {
                values.add(rowScanner.next());
            }
        }
        return values;
    }
}
