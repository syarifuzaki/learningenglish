package com.imk8.android.learningenglish.realm.table;

import io.realm.RealmObject;

/**
 * Created by dev_deny on 4/19/17.
 */

public class Pembelajaran extends RealmObject {

    private String word;
    private String type;
    private int image;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
