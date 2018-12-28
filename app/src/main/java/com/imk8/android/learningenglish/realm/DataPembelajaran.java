package com.imk8.android.learningenglish.realm;

import android.app.Activity;

import com.imk8.android.learningenglish.R;

import io.realm.Realm;

/**
 * Created by dev_deny on 4/8/17.
 */

public class DataPembelajaran {

    Realm realm;

    public DataPembelajaran(Activity act) {
        realm = RealmController.with(act).getRealm();
        RealmController.with(act).clearDataPembelajaran();

        RealmController.with(act).insertPembelajaranWarna("gray", R.drawable.color_abu_abu);
        RealmController.with(act).insertPembelajaranWarna("blue", R.drawable.color_biru);
        RealmController.with(act).insertPembelajaranWarna("brown", R.drawable.color_cokelat);
        RealmController.with(act).insertPembelajaranWarna("green", R.drawable.color_hijau);
        RealmController.with(act).insertPembelajaranWarna("black", R.drawable.color_hitam);
        RealmController.with(act).insertPembelajaranWarna("yellow", R.drawable.color_kuning);
        RealmController.with(act).insertPembelajaranWarna("red", R.drawable.color_merah);
        RealmController.with(act).insertPembelajaranWarna("orange", R.drawable.color_oranye);
        RealmController.with(act).insertPembelajaranWarna("white", R.drawable.color_putih);
        RealmController.with(act).insertPembelajaranWarna("purple", R.drawable.color_ungu);


        RealmController.with(act).insertPembelajaranAngka("one", R.drawable.number_1);
        RealmController.with(act).insertPembelajaranAngka("two", R.drawable.number_2);
        RealmController.with(act).insertPembelajaranAngka("tree", R.drawable.number_3);
        RealmController.with(act).insertPembelajaranAngka("four", R.drawable.number_4);
        RealmController.with(act).insertPembelajaranAngka("five", R.drawable.number_5);
        RealmController.with(act).insertPembelajaranAngka("six", R.drawable.number_6);
        RealmController.with(act).insertPembelajaranAngka("seven", R.drawable.number_7);
        RealmController.with(act).insertPembelajaranAngka("eight", R.drawable.number_8);
        RealmController.with(act).insertPembelajaranAngka("nine", R.drawable.number_9);
        RealmController.with(act).insertPembelajaranAngka("ten", R.drawable.number_10);
        RealmController.with(act).insertPembelajaranAngka("eleven", R.drawable.number_11);
        RealmController.with(act).insertPembelajaranAngka("twelve", R.drawable.number_12);
        RealmController.with(act).insertPembelajaranAngka("thirteen", R.drawable.number_13);
        RealmController.with(act).insertPembelajaranAngka("fourteen", R.drawable.number_14);
        RealmController.with(act).insertPembelajaranAngka("fifteen", R.drawable.number_15);
        RealmController.with(act).insertPembelajaranAngka("sixteen", R.drawable.number_16);
        RealmController.with(act).insertPembelajaranAngka("seventeen", R.drawable.number_17);
        RealmController.with(act).insertPembelajaranAngka("eighteen", R.drawable.number_18);
        RealmController.with(act).insertPembelajaranAngka("nineteen", R.drawable.number_19);
        RealmController.with(act).insertPembelajaranAngka("twenty", R.drawable.number_20);
        RealmController.with(act).insertPembelajaranAngka("twenty-one", R.drawable.number_21);
        RealmController.with(act).insertPembelajaranAngka("twenty two", R.drawable.number_22);
        RealmController.with(act).insertPembelajaranAngka("twenty-three", R.drawable.number_23);
        RealmController.with(act).insertPembelajaranAngka("twenty four", R.drawable.number_24);
        RealmController.with(act).insertPembelajaranAngka("twenty-five", R.drawable.number_25);
        RealmController.with(act).insertPembelajaranAngka("twenty six", R.drawable.number_26);
        RealmController.with(act).insertPembelajaranAngka("twenty-seven", R.drawable.number_27);
        RealmController.with(act).insertPembelajaranAngka("twenty eight", R.drawable.number_28);
        RealmController.with(act).insertPembelajaranAngka("twenty-nine", R.drawable.number_29);
        RealmController.with(act).insertPembelajaranAngka("thirty", R.drawable.number_30);

        RealmController.with(act).insertPembelajaranKata("a", R.drawable.word_a);
        RealmController.with(act).insertPembelajaranKata("b", R.drawable.word_b);
        RealmController.with(act).insertPembelajaranKata("c", R.drawable.word_c);
        RealmController.with(act).insertPembelajaranKata("d", R.drawable.word_d);
        RealmController.with(act).insertPembelajaranKata("e", R.drawable.word_e);
        RealmController.with(act).insertPembelajaranKata("f", R.drawable.word_f);
        RealmController.with(act).insertPembelajaranKata("g", R.drawable.word_g);
        RealmController.with(act).insertPembelajaranKata("h", R.drawable.word_h);
        RealmController.with(act).insertPembelajaranKata("i", R.drawable.word_i);
        RealmController.with(act).insertPembelajaranKata("j", R.drawable.word_j);
        RealmController.with(act).insertPembelajaranKata("k", R.drawable.word_k);
        RealmController.with(act).insertPembelajaranKata("l", R.drawable.word_l);
        RealmController.with(act).insertPembelajaranKata("m", R.drawable.word_m);
        RealmController.with(act).insertPembelajaranKata("n", R.drawable.word_n);
        RealmController.with(act).insertPembelajaranKata("o", R.drawable.word_o);
        RealmController.with(act).insertPembelajaranKata("p", R.drawable.word_p);
        RealmController.with(act).insertPembelajaranKata("q", R.drawable.word_q);
        RealmController.with(act).insertPembelajaranKata("r", R.drawable.word_r);
        RealmController.with(act).insertPembelajaranKata("s", R.drawable.word_s);
        RealmController.with(act).insertPembelajaranKata("t", R.drawable.word_t);
        RealmController.with(act).insertPembelajaranKata("u", R.drawable.word_u);
        RealmController.with(act).insertPembelajaranKata("v", R.drawable.word_v);
        RealmController.with(act).insertPembelajaranKata("w", R.drawable.word_w);
        RealmController.with(act).insertPembelajaranKata("x", R.drawable.word_x);
        RealmController.with(act).insertPembelajaranKata("y", R.drawable.word_y);
        RealmController.with(act).insertPembelajaranKata("z", R.drawable.word_z);

        RealmController.with(act).insertPembelajaranBuah("apple", R.drawable.apple);
        RealmController.with(act).insertPembelajaranBuah("banana", R.drawable.banana);
        RealmController.with(act).insertPembelajaranBuah("cherry", R.drawable.cherry);
        RealmController.with(act).insertPembelajaranBuah("grape", R.drawable.grape);
        RealmController.with(act).insertPembelajaranBuah("lemon", R.drawable.lemon);
        RealmController.with(act).insertPembelajaranBuah("pineapple", R.drawable.pineapple);
        RealmController.with(act).insertPembelajaranBuah("strawberry", R.drawable.strawberry);
        RealmController.with(act).insertPembelajaranBuah("watermelon", R.drawable.watermelon);

        RealmController.with(act).insertPembelajaranHewan("camel", R.drawable.camel);
        RealmController.with(act).insertPembelajaranHewan("cat", R.drawable.cat);
        RealmController.with(act).insertPembelajaranHewan("cow", R.drawable.cow);
        RealmController.with(act).insertPembelajaranHewan("crocodile", R.drawable.crocodile);
        RealmController.with(act).insertPembelajaranHewan("elephant", R.drawable.elephant);
        RealmController.with(act).insertPembelajaranHewan("giraffe", R.drawable.giraffe);
        RealmController.with(act).insertPembelajaranHewan("hippopotamus", R.drawable.hippopotamus);
        RealmController.with(act).insertPembelajaranHewan("kangaroo", R.drawable.kangaroo);
        RealmController.with(act).insertPembelajaranHewan("lion", R.drawable.lion);
        RealmController.with(act).insertPembelajaranHewan("rizsky", R.drawable.monkey);
        RealmController.with(act).insertPembelajaranHewan("owl", R.drawable.owl);
        RealmController.with(act).insertPembelajaranHewan("panda", R.drawable.panda);
        RealmController.with(act).insertPembelajaranHewan("pig", R.drawable.pig);
        RealmController.with(act).insertPembelajaranHewan("rabbit", R.drawable.rabbit);
        RealmController.with(act).insertPembelajaranHewan("rhino", R.drawable.rhino);
        RealmController.with(act).insertPembelajaranHewan("shark", R.drawable.shark);
        RealmController.with(act).insertPembelajaranHewan("sheep", R.drawable.sheep);
        RealmController.with(act).insertPembelajaranHewan("snake", R.drawable.snake);
        RealmController.with(act).insertPembelajaranHewan("spider", R.drawable.spider);
        RealmController.with(act).insertPembelajaranHewan("tiger", R.drawable.tiger);
        RealmController.with(act).insertPembelajaranHewan("turtle", R.drawable.turtle);

    }
}
