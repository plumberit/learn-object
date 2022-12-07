package com.company;

import java.util.ArrayList;

public class Shop {
    String name;

    ArrayList<Product> products = new ArrayList<>();

    Product product1 = new Product();
    Product product2 = new Product();
    Product product3 = new Product();

    {
        products.add(product1);
        products.add(product2);
        products.add(product3);
    }
}
