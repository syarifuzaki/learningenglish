package com.imk8.android.learningenglish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class GameActivity extends AppCompatActivity{
    Button b_answer1,b_answer2, b_answer3, b_answer4;

    ImageView iv_soal;

    List<SoalItem> list;

    Random r;

    int turn = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        r = new Random();

        iv_soal = (ImageView) findViewById(R.id.iv_soal);

        b_answer1 = (Button) findViewById(R.id.b_answer1);
        b_answer2 = (Button) findViewById(R.id.b_answer2);
        b_answer3 = (Button) findViewById(R.id.b_answer3);
        b_answer4 = (Button) findViewById(R.id.b_answer4);

        list = new ArrayList<>();

        for(int i = 0; i <new Database().answers.length; i++){
            list.add(new SoalItem(new Database().answers[i], new Database().soal[i]));
        }

        Collections.shuffle(list);

        newQuestion(turn);

        b_answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(b_answer1.getText().toString().equalsIgnoreCase(list.get(turn-1).getName())){
                    Toast.makeText(GameActivity.this, "Benar!", Toast.LENGTH_SHORT).show();

                    if (turn <list.size()){
                        turn++;
                        newQuestion(turn);
                    }else {
//                        Toast.makeText(GameActivity.this, "You finished the game", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(GameActivity.this, FinishGame.class));
                    }
                }else {
                    Toast.makeText(GameActivity.this, "Salah, coba lagi!", Toast.LENGTH_SHORT).show();
//                    Toast.makeText(GameActivity.this, "You lost the game!", Toast.LENGTH_SHORT).show();
//                    finish();
                }
            }
        });

        b_answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(b_answer2.getText().toString().equalsIgnoreCase(list.get(turn-1).getName())){
                    Toast.makeText(GameActivity.this, "Benar!", Toast.LENGTH_SHORT).show();

                    if (turn <list.size()){
                        turn++;
                        newQuestion(turn);
                    }else {
//                        Toast.makeText(GameActivity.this, "You finished the game", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(GameActivity.this, FinishGame.class));
                    }
                }else {
                    Toast.makeText(GameActivity.this, "Salah, coba lagi!", Toast.LENGTH_SHORT).show();
//                    Toast.makeText(GameActivity.this, "You lost the game!", Toast.LENGTH_SHORT).show();
//                    finish();
                }
            }
        });

        b_answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(b_answer3.getText().toString().equalsIgnoreCase(list.get(turn-1).getName())){
                    Toast.makeText(GameActivity.this, "Benar!", Toast.LENGTH_SHORT).show();

                    if (turn <list.size()){
                        turn++;
                        newQuestion(turn);
                    }else {
//                        Toast.makeText(GameActivity.this, "You finished the game", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(GameActivity.this, FinishGame.class));
                    }
                }else {
                    Toast.makeText(GameActivity.this, "Salah, coba lagi!", Toast.LENGTH_SHORT).show();
//                    Toast.makeText(GameActivity.this, "You lost the game!", Toast.LENGTH_SHORT).show();
//                    finish();
                }
            }
        });

        b_answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(b_answer4.getText().toString().equalsIgnoreCase(list.get(turn-1).getName())){
                    Toast.makeText(GameActivity.this, "Benar!", Toast.LENGTH_SHORT).show();

                    if (turn <list.size()){
                        turn++;
                        newQuestion(turn);
                    }else {
//                        Toast.makeText(GameActivity.this, "You finished the game", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(GameActivity.this, FinishGame.class));
                    }
                }else {
                    Toast.makeText(GameActivity.this, "Salah, coba lagi!", Toast.LENGTH_SHORT).show();
//                    Toast.makeText(GameActivity.this, "You lost the game!", Toast.LENGTH_SHORT).show();
//                    finish();
                }
            }
        });
    }

    private void newQuestion(int number) {
        iv_soal.setImageResource(list.get(number-1).getImage());

        int correct_answer = r.nextInt(4)+1;

        int firstButton = number-1;
        int secondButton;
        int thirdButton;
        int fourthButton;

        switch (correct_answer){
            case 1 :
                b_answer1.setText(list.get(firstButton).getName());

                do{
                    secondButton = r.nextInt(list.size());
                }while (secondButton == firstButton);
                do{
                    thirdButton = r.nextInt(list.size());
                }while (thirdButton == firstButton || thirdButton== secondButton);
                do{
                    fourthButton = r.nextInt(list.size());
                }while (fourthButton == firstButton || fourthButton == secondButton || fourthButton == thirdButton);

                b_answer2.setText(list.get(secondButton).getName());
                b_answer3.setText(list.get(thirdButton).getName());
                b_answer4.setText(list.get(fourthButton).getName());
                break;
            case 2 :
                b_answer2.setText(list.get(firstButton).getName());

                do{
                    secondButton = r.nextInt(list.size());
                }while (secondButton == firstButton);
                do{
                    thirdButton = r.nextInt(list.size());
                }while (thirdButton == firstButton || thirdButton== secondButton);
                do{
                    fourthButton = r.nextInt(list.size());
                }while (fourthButton == firstButton || fourthButton == secondButton || fourthButton == thirdButton);

                b_answer1.setText(list.get(secondButton).getName());
                b_answer3.setText(list.get(thirdButton).getName());
                b_answer4.setText(list.get(fourthButton).getName());
                break;
            case 3 :
                b_answer3.setText(list.get(firstButton).getName());

                do{
                    secondButton = r.nextInt(list.size());
                }while (secondButton == firstButton);
                do{
                    thirdButton = r.nextInt(list.size());
                }while (thirdButton == firstButton || thirdButton== secondButton);
                do{
                    fourthButton = r.nextInt(list.size());
                }while (fourthButton == firstButton || fourthButton == secondButton || fourthButton == thirdButton);

                b_answer2.setText(list.get(secondButton).getName());
                b_answer1.setText(list.get(thirdButton).getName());
                b_answer4.setText(list.get(fourthButton).getName());
                break;
            case 4 :
                b_answer4.setText(list.get(firstButton).getName());

                do{
                    secondButton = r.nextInt(list.size());
                }while (secondButton == firstButton);
                do{
                    thirdButton = r.nextInt(list.size());
                }while (thirdButton == firstButton || thirdButton== secondButton);
                do{
                    fourthButton = r.nextInt(list.size());
                }while (fourthButton == firstButton || fourthButton == secondButton || fourthButton == thirdButton);

                b_answer2.setText(list.get(secondButton).getName());
                b_answer3.setText(list.get(thirdButton).getName());
                b_answer1.setText(list.get(fourthButton).getName());
                break;


        }
    }
}
