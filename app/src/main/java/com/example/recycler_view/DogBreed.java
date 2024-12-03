package com.example.recycler_view;

import java.io.Serializable;

/** @noinspection ALL*/
public class DogBreed implements Serializable {
    private String name;
    private int imageResId;
    private String description;

    public DogBreed(String name, int imageResId, String description) {
        this.name = name;
        this.imageResId = imageResId;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getDescription() {
        return description;
    }
}
