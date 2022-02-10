package com.aaak.iv.box;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Box {
    abstract int maxSize();
    abstract String label();

    List<Product> productList = new ArrayList<>();

    int totalSize(){
        return productList.stream().map( p -> p.size).mapToInt(Integer::intValue).sum();
    }

    private boolean fits(Product product){
        return totalSize() + product.size < maxSize();
    }

    boolean addPackage(Product product){
        boolean boxed = false;
        if(fits(product)){
            productList.add(product);
            boxed = true;
        }
        return boxed;
    }
}


