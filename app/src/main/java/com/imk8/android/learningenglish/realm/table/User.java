package com.imk8.android.learningenglish.realm.table;

import io.realm.RealmObject;

/**
 * Created by dev_deny on 4/9/17.
 */

public class User extends RealmObject {

    private String name;
    private int score;
    private int soul;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getSoul() {
        return soul;
    }

    public void setSoul(int soul) {
        this.soul = soul;
    }
}
