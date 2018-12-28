package com.imk8.android.learningenglish.realm;


import android.app.Activity;
import android.app.Application;
import android.support.v4.app.Fragment;

import com.imk8.android.learningenglish.realm.table.Pembelajaran;
import com.imk8.android.learningenglish.realm.table.User;
import com.imk8.android.learningenglish.realm.table.Value;

import io.realm.Realm;
import io.realm.RealmResults;
import io.realm.Sort;


public class RealmController {

    private static RealmController instance;
    private final Realm realm;

    public RealmController(Application application) {
        Realm.init(application.getApplicationContext());
        realm = Realm.getDefaultInstance();
    }

    public static RealmController with(Fragment fragment) {

        if (instance == null) {
            instance = new RealmController(fragment.getActivity().getApplication());
        }
        return instance;
    }

    public static RealmController with(Activity activity) {

        if (instance == null) {
            instance = new RealmController(activity.getApplication());
        }
        return instance;
    }

    public static RealmController with(Application application) {

        if (instance == null) {
            instance = new RealmController(application);
        }
        return instance;
    }

    public static RealmController getInstance() {

        return instance;
    }

    public Realm getRealm() {

        return realm;
    }


    /**
     *
     * Value Controller
     *
     * */

    public Value createValue() {
        clearDataValue();
        return realm.createObject(Value.class);
    }

    public void clearDataValue() {
        realm.beginTransaction();
        getAllValueOnce().deleteAllFromRealm();
        realm.commitTransaction();
    }

    public void insertValue(int id, String value, int image, String backup_value){
        realm.beginTransaction();
        Value data = realm.createObject(Value.class);
        data.setId(id);
        data.setOnce(0);
        data.setValue(value);
        data.setImage(image);
        data.setBackup_value(backup_value);
        realm.commitTransaction();
    }

    public void editValueOnce(String key){
        realm.beginTransaction();
        Value value = getValue(key);
        value.setOnce(1);
        realm.commitTransaction();
    }

    /*public void editAllValueOnceOne(){
        RealmResults<Value> values = getAllValue();
        for (int i = 0; i < values.size(); i++) {
            realm.beginTransaction();
            Value value = values.get(i);
            value.setOnce(1);
            realm.commitTransaction();
        }
    }*/

    public void editAllValueOnce(){
        RealmResults<Value> values = getAllValue();
        for (int i = 0; i < values.size(); i++) {
            realm.beginTransaction();
            Value value = values.get(i);
            value.setOnce(0);
            realm.commitTransaction();
        }
    }

    public RealmResults<Value> getAllValue() {
        return realm.where(Value.class).findAll();
    }

    public RealmResults<Value> getAllValueOnce() {
        return realm.where(Value.class).equalTo("once", 0).findAll();
    }

    public RealmResults<Value> getAllValueAscending() {
        RealmResults<Value> result = realm.where(Value.class).findAll();
        result.sort("id", Sort.ASCENDING);
        return result;
    }

    public Value getValue(String value) {
        return realm.where(Value.class)
                .equalTo("value", value)
                .findFirst();
    }

    public Number getId(){
        Number currentIdNum = realm.where(Value.class).max("id");
        int nextId;
        if(currentIdNum == null) {
            nextId = 1;
        } else {
            nextId = currentIdNum.intValue() + 1;
        }
        return currentIdNum;
    }


//    /**
//     * Create User
//     * */
//
//    public User createUser() {
//        //clearUser();
//        return realm.createObject(User.class);
//    }
//
//    public void clearUser() {
//        getAllUser().deleteAllFromRealm();
//    }
//
//    public RealmResults<User> getAllUser() {
//        return realm.where(User.class).findAllSorted("score", Sort.DESCENDING);
//    }
//
//    public void insertUser(String name){
//        realm.beginTransaction();
//        User user = createUser();
//        user.setName(name);
//        user.setScore(0);
//        user.setSoul(5);
//        realm.commitTransaction();
//    }
//
//    public User getItemUser(String name) {
//        return realm.where(User.class)
//                .equalTo("name", name)
//                .findFirst();
//    }
//
//    public void editUserScore(String name, int score){
//        realm.beginTransaction();
//        User user = getUser(name);
//        user.setScore(score);
//        realm.commitTransaction();
//    }
//
//    public void editUserSoul(String name){
//        realm.beginTransaction();
//        User user = getUser(name);
//        user.setSoul(user.getSoul() - 1);
//        realm.commitTransaction();
//    }
//
//    public User getUser(String name) {
//        return realm.where(User.class)
//                .equalTo("name", name)
//                .findFirst();
//    }



    /**
     *
     * Pembelajaran
     *
     * */

    public void clearDataPembelajaran() {
        realm.beginTransaction();
        getAllPembelajaran().deleteAllFromRealm();
        realm.commitTransaction();
    }


    public void insertPembelajaranWarna(String word, int image){
        realm.beginTransaction();
        Pembelajaran pembelajaran = realm.createObject(Pembelajaran.class);
        pembelajaran.setType("warna");
        pembelajaran.setWord(word);
        pembelajaran.setImage(image);
        realm.commitTransaction();
    }

    public void insertPembelajaranAngka(String word, int image){
        realm.beginTransaction();
        Pembelajaran pembelajaran = realm.createObject(Pembelajaran.class);
        pembelajaran.setType("angka");
        pembelajaran.setWord(word);
        pembelajaran.setImage(image);
        realm.commitTransaction();
    }

    public void insertPembelajaranKata(String word, int image){
        realm.beginTransaction();
        Pembelajaran pembelajaran = realm.createObject(Pembelajaran.class);
        pembelajaran.setType("kata");
        pembelajaran.setWord(word);
        pembelajaran.setImage(image);
        realm.commitTransaction();
    }

    public void insertPembelajaranHewan(String word, int image){
        realm.beginTransaction();
        Pembelajaran pembelajaran = realm.createObject(Pembelajaran.class);
        pembelajaran.setType("hewan");
        pembelajaran.setWord(word);
        pembelajaran.setImage(image);
        realm.commitTransaction();
    }

    public void insertPembelajaranBuah(String word, int image){
        realm.beginTransaction();
        Pembelajaran pembelajaran = realm.createObject(Pembelajaran.class);
        pembelajaran.setType("buah");
        pembelajaran.setWord(word);
        pembelajaran.setImage(image);
        realm.commitTransaction();
    }

    public RealmResults<Pembelajaran> getPembelajaran(String type) {
        return realm.where(Pembelajaran.class).equalTo("type", type).findAll();
    }

    public RealmResults<Pembelajaran> getAllPembelajaran() {
        return realm.where(Pembelajaran.class).findAll();
    }


}
