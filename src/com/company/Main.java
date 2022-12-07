package com.company;

public class Main {

    public static void main(String[] args) {
        getTheLowestPrice(0);
        getShopWithTheLowestPrice(2);
        getShopWherePriceIsLowerThanRecommended(2);
    }

    public static void getTheLowestPrice(int a) {
        Value array = new Value();
        int temp = 99999999;
        for (int i = 0; i < 3; i++) {
            if (array.gimme.shops.get(i).products.get(a).price < temp) {
                temp = array.gimme.shops.get(i).products.get(a).price;
            }
        }
        System.out.println("Наименьшая цена на телефон: " + temp);
    }

    public static void getShopWithTheLowestPrice(int a) {
        Value array = new Value();
        int temp = 99999999;
        for (int i = 0; i < 3; i++) {
            if (array.gimme.shops.get(i).products.get(a).price < temp) {
                temp = array.gimme.shops.get(i).products.get(a).price;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (array.gimme.shops.get(i).products.get(a).price == temp) {
                System.out.println("Магазин в котором самый дешевый ноутбук: " + array.gimme.shops.get(i).name);
            }
        }
    }

    public static void getShopWherePriceIsLowerThanRecommended(int a) {
        Value array = new Value();
        for (int i = 0; i < 3; i++) {
            if (array.gimme.shops.get(i).products.get(a).price < array.gimme.shops.get(i).products.get(a).priceRecommend) {
                System.out.println("Магазин в котором цена на ноутбук ниже рекомендованной: " + array.gimme.shops.get(i).name);
            }
        }
    }
}
