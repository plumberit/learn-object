package com.company;

public class Value {

    // CLASS TO INITIALIZE ALL COMPONENTS

    Service gimme = new Service();

    {
        //names of shops
        gimme.shops.get(0).name = "Rozetka";
        gimme.shops.get(1).name = "Comfy";
        gimme.shops.get(2).name = "Citrus";
    }

    {
        //Rozetka names of products
        gimme.shops.get(0).products.get(0).name = "Smartphone";
        gimme.shops.get(0).products.get(1).name = "Tablet";
        gimme.shops.get(0).products.get(2).name = "Notebook";
        //Rozetka prices of products
        gimme.shops.get(0).products.get(0).price = 4899;
        gimme.shops.get(0).products.get(1).price = 6499;
        gimme.shops.get(0).products.get(2).price = 21599;
        //Rozetka recommended prices of products
        gimme.shops.get(0).products.get(0).priceRecommend = 4800;
        gimme.shops.get(0).products.get(1).priceRecommend = 6400;
        gimme.shops.get(0).products.get(2).priceRecommend = 23500;
    }

    {
        //Comfy names of products
        gimme.shops.get(1).products.get(0).name = "Smartphone";
        gimme.shops.get(1).products.get(1).name = "Tablet";
        gimme.shops.get(1).products.get(2).name = "Notebook";
        //Comfy prices of products
        gimme.shops.get(1).products.get(0).price = 4999;
        gimme.shops.get(1).products.get(1).price = 6599;
        gimme.shops.get(1).products.get(2).price = 21699;
        //Comfy recommended prices of products
        gimme.shops.get(1).products.get(0).priceRecommend = 4800;
        gimme.shops.get(1).products.get(1).priceRecommend = 6400;
        gimme.shops.get(1).products.get(2).priceRecommend = 21500;
    }

    {
        //Citrus names of products
        gimme.shops.get(2).products.get(0).name = "Smartphone";
        gimme.shops.get(2).products.get(1).name = "Tablet";
        gimme.shops.get(2).products.get(2).name = "Notebook";
        //Citrus prices of products
        gimme.shops.get(2).products.get(0).price = 4799;
        gimme.shops.get(2).products.get(1).price = 6399;
        gimme.shops.get(2).products.get(2).price = 21499;
        //Citrus recommended prices of products
        gimme.shops.get(2).products.get(0).priceRecommend = 4800;
        gimme.shops.get(2).products.get(1).priceRecommend = 6400;
        gimme.shops.get(2).products.get(2).priceRecommend = 21400;
    }
}
