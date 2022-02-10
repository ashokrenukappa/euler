package com.aaak.iv.box;

public class MediumBox extends Box{
    @Override
    int maxSize() {
        return 2;
    }

    @Override
    String label() {
        return "M";
    }
}
