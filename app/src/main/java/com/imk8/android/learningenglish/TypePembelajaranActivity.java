package com.imk8.android.learningenglish;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.imk8.android.learningenglish.realm.DataPembelajaran;

/**
 * Created by dev_deny on 4/24/17.
 */

public class TypePembelajaranActivity extends AppCompatActivity {

    ImageButton btnHuruf;
    ImageButton btnAngka;
    ImageButton btnWarna;
    ImageButton btnBuah;
    ImageButton btnHewan;
    ImageButton btnGames;
    Button exit;

    UserPreference userPreference;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori);

        userPreference = UserPreference.getInstance(this);

        if (!userPreference.getPembelajaran()) {
            new DataPembelajaran(TypePembelajaranActivity.this);
            userPreference.setPembelajaran(true);
        }

        btnHuruf = (ImageButton) findViewById(R.id.btnHuruf);
        btnAngka = (ImageButton) findViewById(R.id.btnAngka);
        btnHewan = (ImageButton) findViewById(R.id.btnHewan);
        btnBuah = (ImageButton) findViewById(R.id.btnBuah);
        btnWarna = (ImageButton) findViewById(R.id.btnWarna);
        btnGames = (ImageButton) findViewById(R.id.btnGames);
        exit = (Button) findViewById(R.id.btnExit);

        btnHuruf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TypePembelajaranActivity.this, PembelajaranActivity.class);
                intent.putExtra("type", "kata");
                startActivity(intent);
            }
        });

        btnAngka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TypePembelajaranActivity.this, PembelajaranActivity.class);
                intent.putExtra("type", "angka");
                startActivity(intent);
            }
        });

        btnWarna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TypePembelajaranActivity.this, PembelajaranActivity.class);
                intent.putExtra("type", "warna");
                startActivity(intent);
            }
        });

//        btnWarna.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(TypePembelajaranActivity.this, PembelajaranActivity.class);
//                intent.putExtra("type", "warna");
//                startActivity(intent);
//            }
//        });

        btnHewan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TypePembelajaranActivity.this, PembelajaranActivity.class);
                intent.putExtra("type", "hewan");
                startActivity(intent);
            }
        });

        btnBuah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TypePembelajaranActivity.this, PembelajaranActivity.class);
                intent.putExtra("type", "buah");
                startActivity(intent);
            }
        });
        btnGames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TypePembelajaranActivity.this, GameActivity.class));
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlertDialog();
            }
        });
    }

    public void onBackPressed() {
        showAlertDialog();
    }

    private void showAlertDialog() {
        AlertDialog builder = new AlertDialog.Builder(this)
                .setMessage("Tutup Aplikasi ini ?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
//                        TypePembelajaranActivity.this.finish();
                        finish();
                        System.exit(0);
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }
}
