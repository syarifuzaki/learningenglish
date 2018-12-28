package com.imk8.android.learningenglish;

public class SoalItem {
    String name;
    int image;

    public SoalItem(String name,int image){
        this.name = name;
        this.image = image;
    }

    public String getName(){
        return name;
    }

    public int getImage() {
        return image;
    }
}
