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

    }

    public void buttonRoll(View v) {
        final ImageView leftDice = this.findViewById(R.id.dice1);
        final ImageView rightDice = this.findViewById(R.id.dice2);
        leftDice.setImageResource(diceArray[randomNumberGenerator.nextInt(6)]);
        rightDice.setImageResource(diceArray[randomNumberGenerator.nextInt(6)]);
    }
}
