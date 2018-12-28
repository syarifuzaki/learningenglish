package com.imk8.android.learningenglish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mulai;
    Button pembelajaran;
    Button btnScore;
    Button tentang;
//    UserPreference userPreference;

//    StartDialog startDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        userPreference = UserPreference.getInstance(this);
//        startDialog = StartDialog.newIntance();

        //mulai = (Button) findViewById(R.id.btnMulai);
        pembelajaran = (Button) findViewById(R.id.btnPembelajaran);
//        btnScore = (Button) findViewById(R.id.btnScore);
//        tentang = (Button) findViewById(R.id.btnTentang);



//        if (!userPreference.getInput()) {
//            //if (RealmController.with(MainActivity.this).getAllValueOnce() != null)
//            new DataValue(MainActivity.this);
//            userPreference.setInput(true);
//        }

//        mulai.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startDialog.show(getSupportFragmentManager(), "");
//                startDialog.setOnListener(MainActivity.this);
//            }
//        });

//        pembelajaran.setOnClickListener(
//            public void onClick (View v){
//
//        });
//
        pembelajaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TypePembelajaranActivity.class));
            }
        });

        //        btnScore.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, ScoreActivity.class));
//            }
//        });
//
//        tentang.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, BantuanActivity.class));
//            }
//        });
    }

//    @Override
//    public void onClick(String name) {
//        userPreference.setUserName(name);
//        startActivity(new Intent(MainActivity.this, QuizActivity.class));
//    }
}
