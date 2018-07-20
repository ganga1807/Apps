package com.example.ganga.awesomefruits;


public class Fruits {

    private String fruitName;

    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;


    public Fruits(String fruit,int mimageResourceId) {

        fruitName = fruit;
        mImageResourceId = mimageResourceId;
    }



    public String getFruitName() {
        return fruitName;
    }



    public int getImageResourceId() {
        return mImageResourceId;
    }
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}