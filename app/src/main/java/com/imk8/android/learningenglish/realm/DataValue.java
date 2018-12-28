package com.imk8.android.learningenglish.realm;

import android.app.Activity;

import com.imk8.android.learningenglish.R;

import io.realm.Realm;

/**
 * Created by dev_deny on 4/8/17.
 */

public class DataValue {

    Realm realm;


    public DataValue(Activity act) {
        realm = RealmController.with(act).getRealm();
        RealmController.with(act).clearDataValue();

        RealmController.with(act).insertValue(1, "1", R.drawable.number_1, "ATU,SATUH,SATU");
        RealmController.with(act).insertValue(2, "2", R.drawable.number_2, "DUAH,DUA");
        RealmController.with(act).insertValue(3, "3", R.drawable.number_3, "TIGAH,TIGA");
        RealmController.with(act).insertValue(4, "4", R.drawable.number_4, "PAT,EMPAT");
        RealmController.with(act).insertValue(5, "5", R.drawable.number_5, "LIMAH,LIMA");
        RealmController.with(act).insertValue(6, "6", R.drawable.number_6, "NAM,ENAM");
        RealmController.with(act).insertValue(7, "7", R.drawable.number_7, "TUJU,TUJUH");
        RealmController.with(act).insertValue(8, "8", R.drawable.number_8, "LAPAN,DELAPAN");
        RealmController.with(act).insertValue(9, "9", R.drawable.number_9, "BILAN,SEMBILAN");
        RealmController.with(act).insertValue(10, "10", R.drawable.number_10, "");
        RealmController.with(act).insertValue(11, "12", R.drawable.number_12, "");
        RealmController.with(act).insertValue(13, "13", R.drawable.number_13, "");
        RealmController.with(act).insertValue(14, "14", R.drawable.number_14, "PAT BELAS,EMPAT BELAS");
        RealmController.with(act).insertValue(15, "15", R.drawable.number_15, "LIMAHBELAS,LIMA BELAS");
        RealmController.with(act).insertValue(16, "16", R.drawable.number_16, "NAMBELAS,ENAMBELAS");
        RealmController.with(act).insertValue(17, "17", R.drawable.number_17, "TUJUBELAS,TUJUHBELAS");
        RealmController.with(act).insertValue(18, "18", R.drawable.number_18, "LAPANBELAS,DELAPAN BELAS");
        RealmController.with(act).insertValue(19, "19", R.drawable.number_19, "");
        RealmController.with(act).insertValue(20, "20", R.drawable.number_20, "");
        RealmController.with(act).insertValue(21, "21", R.drawable.number_21, "");
        RealmController.with(act).insertValue(22, "22", R.drawable.number_22, "");
        RealmController.with(act).insertValue(23, "23", R.drawable.number_23, "");
        RealmController.with(act).insertValue(24, "24", R.drawable.number_24, "");
        RealmController.with(act).insertValue(25, "25", R.drawable.number_25, "");
        RealmController.with(act).insertValue(26, "26", R.drawable.number_26, "");
        RealmController.with(act).insertValue(27, "27", R.drawable.number_27, "");
        RealmController.with(act).insertValue(28, "28", R.drawable.number_28, "");
        RealmController.with(act).insertValue(29, "29", R.drawable.number_29, "");
        RealmController.with(act).insertValue(30, "30", R.drawable.number_30, "");
        RealmController.with(act).insertValue(31, "abu-abu", R.drawable.color_abu_abu, "ABU,ABUH-ABUH,HABUH-HABUH,ABU-ABU");
        RealmController.with(act).insertValue(32, "biru", R.drawable.color_biru, "BILU,BIRU");
        RealmController.with(act).insertValue(33, "cokelat", R.drawable.color_cokelat, "COKELAT,COKLAT");
        RealmController.with(act).insertValue(34, "hijau", R.drawable.color_hijau, "HIJOU,HIJAU");
        RealmController.with(act).insertValue(35, "hitam", R.drawable.color_hitam, "HITAM,ITAM,ITEM");
        RealmController.with(act).insertValue(36, "kuning", R.drawable.color_kuning, "");
        RealmController.with(act).insertValue(37, "merah", R.drawable.color_merah, "MELAH,MERAH");
        RealmController.with(act).insertValue(38, "oranye", R.drawable.color_oranye, "ORANYE,ORANGE");
        RealmController.with(act).insertValue(39, "putih", R.drawable.color_putih, "PUTI,PUTIH");
        RealmController.with(act).insertValue(40, "ungu", R.drawable.color_ungu, "UNU,UNGU");
        //RealmController.with(act).insertValue(41, "a", R.drawable.word_a, "");
        RealmController.with(act).insertValue(42, "b", R.drawable.word_b, "be,beb,bi");
        RealmController.with(act).insertValue(43, "c", R.drawable.word_c, "ce,se,cek");
        RealmController.with(act).insertValue(44, "d", R.drawable.word_d, "de,dee,dhe,di");
        //RealmController.with(act).insertValue(45, "e", R.drawable.word_e, "");
        RealmController.with(act).insertValue(46, "f", R.drawable.word_f, "ef,eff");
        RealmController.with(act).insertValue(47, "g", R.drawable.word_g, "ge,gee");
        RealmController.with(act).insertValue(48, "h", R.drawable.word_h, "hack,ha,hah");
        //RealmController.with(act).insertValue(49, "i", R.drawable.word_i, "");
        RealmController.with(act).insertValue(50, "j", R.drawable.word_j, "je,jee");
        RealmController.with(act).insertValue(51, "k", R.drawable.word_k, "ka,kak");
        RealmController.with(act).insertValue(52, "l", R.drawable.word_l, "el,ell");
        RealmController.with(act).insertValue(53, "m", R.drawable.word_m, "em,emm");
        RealmController.with(act).insertValue(54, "n", R.drawable.word_n, "en,end,and");
        //RealmController.with(act).insertValue(55, "o", R.drawable.word_o, "");
        RealmController.with(act).insertValue(56, "p", R.drawable.word_p, "pe,phe");
        RealmController.with(act).insertValue(57, "q", R.drawable.word_q, "ki,qyu,qi");
        RealmController.with(act).insertValue(58, "r", R.drawable.word_r, "er,err");
        RealmController.with(act).insertValue(59, "s", R.drawable.word_s, "es,ess,esh");
        RealmController.with(act).insertValue(60, "t", R.drawable.word_t, "te,the,teh");
        //RealmController.with(act).insertValue(61, "u", R.drawable.word_u, "");
        RealmController.with(act).insertValue(62, "v", R.drawable.word_v, "ve,vi,vii");
        RealmController.with(act).insertValue(63, "w", R.drawable.word_w, "we,wi");
        RealmController.with(act).insertValue(64, "x", R.drawable.word_x, "eks,ex,ekss");
        RealmController.with(act).insertValue(65, "y", R.drawable.word_y, "ye,yi,yee");
        RealmController.with(act).insertValue(66, "z", R.drawable.word_z, "zed,zet,ze");

        /*if (type == 1){
            RealmController.with(act).insertValue(1, "1", R.drawable.number_1, "ATU,SATUH,SATU");
            RealmController.with(act).insertValue(2, "2", R.drawable.number_2, "DUAH,DUA");
            RealmController.with(act).insertValue(3, "3", R.drawable.number_3, "TIGAH,TIGA");
            RealmController.with(act).insertValue(4, "4", R.drawable.number_4, "PAT,EMPAT");
            RealmController.with(act).insertValue(5, "5", R.drawable.number_5, "LIMAH,LIMA");
            RealmController.with(act).insertValue(6, "6", R.drawable.number_6, "NAM,ENAM");
            RealmController.with(act).insertValue(7, "7", R.drawable.number_7, "TUJU,TUJUH");
            RealmController.with(act).insertValue(8, "8", R.drawable.number_8, "LAPAN,DELAPAN");
            RealmController.with(act).insertValue(9, "9", R.drawable.number_9, "BILAN,SEMBILAN");
            RealmController.with(act).insertValue(10, "10", R.drawable.number_10, "");
            RealmController.with(act).insertValue(11, "12", R.drawable.number_12, "");
            RealmController.with(act).insertValue(13, "13", R.drawable.number_13, "");
            RealmController.with(act).insertValue(14, "14", R.drawable.number_14, "PAT BELAS,EMPAT BELAS");
            RealmController.with(act).insertValue(15, "15", R.drawable.number_15, "LIMAHBELAS,LIMA BELAS");
            RealmController.with(act).insertValue(16, "16", R.drawable.number_16, "NAMBELAS,ENAMBELAS");
            RealmController.with(act).insertValue(17, "17", R.drawable.number_17, "TUJUBELAS,TUJUHBELAS");
            RealmController.with(act).insertValue(18, "18", R.drawable.number_18, "LAPANBELAS,DELAPAN BELAS");
            RealmController.with(act).insertValue(19, "19", R.drawable.number_19, "");
            RealmController.with(act).insertValue(20, "20", R.drawable.number_20, "");
            RealmController.with(act).insertValue(21, "21", R.drawable.number_21, "");
            RealmController.with(act).insertValue(22, "22", R.drawable.number_22, "");
            RealmController.with(act).insertValue(23, "23", R.drawable.number_23, "");
            RealmController.with(act).insertValue(24, "24", R.drawable.number_24, "");
            RealmController.with(act).insertValue(25, "25", R.drawable.number_25, "");
            RealmController.with(act).insertValue(26, "26", R.drawable.number_26, "");
            RealmController.with(act).insertValue(27, "27", R.drawable.number_27, "");
            RealmController.with(act).insertValue(28, "28", R.drawable.number_28, "");
            RealmController.with(act).insertValue(29, "29", R.drawable.number_29, "");
            RealmController.with(act).insertValue(30, "30", R.drawable.number_30, "");
        } else if (type == 2){
            RealmController.with(act).insertValue(31, "abu-abu", R.drawable.color_abu_abu, "ABU,ABUH-ABUH,HABUH-HABUH,ABU-ABU");
            RealmController.with(act).insertValue(32, "biru", R.drawable.color_biru, "BILU,BIRU");
            RealmController.with(act).insertValue(33, "cokelat", R.drawable.color_cokelat, "COKELAT,COKLAT");
            RealmController.with(act).insertValue(34, "hijau", R.drawable.color_hijau, "HIJOU,HIJAU");
            RealmController.with(act).insertValue(35, "hitam", R.drawable.color_hitam, "HITAM,ITAM,ITEM");
            RealmController.with(act).insertValue(36, "kuning", R.drawable.color_kuning, "");
            RealmController.with(act).insertValue(37, "merah", R.drawable.color_merah, "MELAH,MERAH");
            RealmController.with(act).insertValue(38, "oranye", R.drawable.color_oranye, "ORANYE,ORANGE");
            RealmController.with(act).insertValue(39, "putih", R.drawable.color_putih, "PUTI,PUTIH");
            RealmController.with(act).insertValue(40, "ungu", R.drawable.color_ungu, "UNU,UNGU");
        } else {
            //RealmController.with(act).insertValue(41, "a", R.drawable.word_a, "");
            RealmController.with(act).insertValue(42, "b", R.drawable.word_b, "be,beb,bi");
            RealmController.with(act).insertValue(43, "c", R.drawable.word_c, "ce,se,cek");
            RealmController.with(act).insertValue(44, "d", R.drawable.word_d, "de,dee,dhe,di");
            //RealmController.with(act).insertValue(45, "e", R.drawable.word_e, "");
            RealmController.with(act).insertValue(46, "f", R.drawable.word_f, "ef,eff");
            RealmController.with(act).insertValue(47, "g", R.drawable.word_g, "ge,gee");
            RealmController.with(act).insertValue(48, "h", R.drawable.word_h, "hack,ha,hah");
            //RealmController.with(act).insertValue(49, "i", R.drawable.word_i, "");
            RealmController.with(act).insertValue(50, "j", R.drawable.word_j, "je,jee");
            RealmController.with(act).insertValue(51, "k", R.drawable.word_k, "ka,kak");
            RealmController.with(act).insertValue(52, "l", R.drawable.word_l, "el,ell");
            RealmController.with(act).insertValue(53, "m", R.drawable.word_m, "em,emm");
            RealmController.with(act).insertValue(54, "n", R.drawable.word_n, "en,end,and");
            //RealmController.with(act).insertValue(55, "o", R.drawable.word_o, "");
            RealmController.with(act).insertValue(56, "p", R.drawable.word_p, "pe,phe");
            RealmController.with(act).insertValue(57, "q", R.drawable.word_q, "ki,qyu,qi");
            RealmController.with(act).insertValue(58, "r", R.drawable.word_r, "er,err");
            RealmController.with(act).insertValue(59, "s", R.drawable.word_s, "es,ess,esh");
            RealmController.with(act).insertValue(60, "t", R.drawable.word_t, "te,the,teh");
            //RealmController.with(act).insertValue(61, "u", R.drawable.word_u, "");
            RealmController.with(act).insertValue(62, "v", R.drawable.word_v, "ve,vi,vii");
            RealmController.with(act).insertValue(63, "w", R.drawable.word_w, "we,wi");
            RealmController.with(act).insertValue(64, "x", R.drawable.word_x, "eks,ex,ekss");
            RealmController.with(act).insertValue(65, "y", R.drawable.word_y, "ye,yi,yee");
            RealmController.with(act).insertValue(66, "z", R.drawable.word_z, "zed,zet,ze");
        }*/

        /*ArrayList<Value> values = new ArrayList<>();

        Value value = new Value();
        value.setOnce(0);
        value.setId(1);
        value.setValue("1");
        value.setImage(R.drawable.number_1);
        values.add(value);

        value = new Value();
        value.setOnce(0);
        value.setId(2);
        value.setValue("2");
        value.setImage(R.drawable.number_2);
        values.add(value);

        value = new Value();
        value.setOnce(0);
        value.setId(3);
        value.setValue("3");
        value.setImage(R.drawable.number_3);
        values.add(value);

        value = new Value();
        value.setOnce(0);
        value.setId(4);
        value.setValue("4");
        value.setImage(R.drawable.number_4);
        values.add(value);

        value = new Value();
        value.setOnce(0);
        value.setId(5);
        value.setValue("5");
        value.setImage(R.drawable.number_5);
        values.add(value);

        value = new Value();
        value.setOnce(0);
        value.setId(6);
        value.setValue("6");
        value.setImage(R.drawable.number_6);
        values.add(value);

        value = new Value();
        value.setOnce(0);
        value.setId(7);
        value.setValue("7");
        value.setImage(R.drawable.number_7);
        values.add(value);

        value = new Value();
        value.setOnce(0);
        value.setId(8);
        value.setValue("8");
        value.setImage(R.drawable.number_8);
        values.add(value);

        value = new Value();
        value.setOnce(0);
        value.setId(9);
        value.setValue("9");
        value.setImage(R.drawable.number_9);
        values.add(value);

        *//*RealmController.with(act).insertValue("1");
        RealmController.with(act).insertValue("2");
        RealmController.with(act).insertValue("3");
        RealmController.with(act).insertValue("4");
        RealmController.with(act).insertValue("5");
        RealmController.with(act).insertValue("6");
        RealmController.with(act).insertValue("7");
        RealmController.with(act).insertValue("8");
        RealmController.with(act).insertValue("9");*//*

        for (Value b : values) {
            realm.beginTransaction();
            realm.copyToRealm(b);
            realm.commitTransaction();
        }*/
    }
}
