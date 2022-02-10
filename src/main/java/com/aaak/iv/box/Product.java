package com.aaak.iv.box;

import java.util.Arrays;
import java.util.Optional;

public enum Product {
    CAMERA("Cam",1),
    BLUETOOTH("Blue",2),
    GAMING("Game",4);

    String name;
    int size;

    Product(String name, int size) {
        this.name = name;
        this.size = size;
    }

    static Product getByName(String name){
        Optional<Product> availableProduct = Arrays.stream(values()).filter( p -> p.name.equals(name)).findFirst();
        return availableProduct.orElse(null);
    }
}
