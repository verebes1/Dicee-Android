package com.adprogress.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random randomNumberGenerator = new Random();
    ImageView leftDice;
    ImageView rightDice;

    int[] diceArray = {R.drawable.dice1,
            R.drawable.dice2,
            R.drawable.dice3,
            R.drawable.dice4,
            R.drawable.dice5,
            R.drawable.dice6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        leftDice = findViewById(R.id.dice1);
        rightDice = findViewById(R.id.dice2);
    }

    public void buttonRoll(View v) {
        leftDice.setImageResource(diceArray[randomNumberGenerator.nextInt(6)]);
        rightDice.setImageResource(diceArray[randomNumberGenerator.nextInt(6)]);
    }
}
