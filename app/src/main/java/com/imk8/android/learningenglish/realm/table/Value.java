package com.imk8.android.learningenglish.realm.table;

import io.realm.RealmObject;

/**
 * Created by dev_deny on 4/6/17.
 */

public class Value extends RealmObject {

    private int id;
    private String value;
    private String backup_value;
    private int once;
    private int image;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getOnce() {
        return once;
    }

    public void setOnce(int once) {
        this.once = once;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getBackup_value() {
        return backup_value;
    }

    public void setBackup_value(String backup_value) {
        this.backup_value = backup_value;
    }
}
