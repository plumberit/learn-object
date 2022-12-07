package com.company;

import java.util.ArrayList;

public class Service {
    ArrayList<Shop> shops = new ArrayList<>();

    Shop shop1 = new Shop();
    Shop shop2 = new Shop();
    Shop shop3 = new Shop();

    {
        shops.add(shop1);
        shops.add(shop2);
        shops.add(shop3);
    }
}
