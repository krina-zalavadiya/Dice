package com.dhuli.dice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.Locale;
import java.util.Random;

public class Second extends AppCompatActivity {


    ImageView one, two, three, four, five, six, ani/*one1, two2, three3, four4, five5, six6*/;
    CardView roll;
    TextView toast;
    TextToSpeech text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        ani = findViewById(R.id.ani);

       /* one1 = findViewById(R.id.one1);
        two2 = findViewById(R.id.two2);
        three3 = findViewById(R.id.three3);
        four4 = findViewById(R.id.four4);
        five5 = findViewById(R.id.five5);
        six6 = findViewById(R.id.six6);*/
        roll = findViewById(R.id.roll);
        toast = findViewById(R.id.toast);


        text = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    text.setLanguage(Locale.UK);

                }
            }
        });



        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = new Random().nextInt((6 - 1) + 1) + 1;

                    if(num == 1) {
                        one.setVisibility(View.VISIBLE);
                        two.setVisibility(View.GONE);
                        three.setVisibility(View.GONE);
                        four.setVisibility(View.GONE);
                        five.setVisibility(View.GONE);
                        six.setVisibility(View.GONE);
                    }
                    if (num == 2) {
                        one.setVisibility(View.GONE);
                        two.setVisibility(View.VISIBLE);
                        three.setVisibility(View.GONE);
                        four.setVisibility(View.GONE);
                        five.setVisibility(View.GONE);
                           six.setVisibility(View.GONE);
                    }
                    if (num == 3) {
                        one.setVisibility(View.GONE);
                        two.setVisibility(View.GONE);
                        three.setVisibility(View.VISIBLE);
                        four.setVisibility(View.GONE);
                        five.setVisibility(View.GONE);
                        six.setVisibility(View.GONE);
                    }
                    if (num == 4) {
                        one.setVisibility(View.GONE);
                        two.setVisibility(View.GONE);
                        three.setVisibility(View.GONE);
                        four.setVisibility(View.VISIBLE);
                        five.setVisibility(View.GONE);
                        six.setVisibility(View.GONE);
                    }
                    if (num == 5) {
                        one.setVisibility(View.GONE);
                        two.setVisibility(View.GONE);
                        three.setVisibility(View.GONE);
                        four.setVisibility(View.GONE);
                        five.setVisibility(View.VISIBLE);
                        six.setVisibility(View.GONE);
                    }
                    if (num == 6) {
                        one.setVisibility(View.GONE);
                        two.setVisibility(View.GONE);
                        three.setVisibility(View.GONE);
                        four.setVisibility(View.GONE);
                        five.setVisibility(View.GONE);
                        six.setVisibility(View.VISIBLE);
                    }
/*

                if (num == 1) {
                    one1.setVisibility(View.VISIBLE);
                    two2.setVisibility(View.GONE);
                    three3.setVisibility(View.GONE);
                    four4.setVisibility(View.GONE);
                    five5.setVisibility(View.GONE);
                    six6.setVisibility(View.GONE);
                }
                if (num == 2) {
                    one1.setVisibility(View.GONE);
                    two2.setVisibility(View.VISIBLE);
                    three3.setVisibility(View.GONE);
                    four4.setVisibility(View.GONE);
                    five5.setVisibility(View.GONE);
                    six6.setVisibility(View.GONE);
                }if (num == 3) {
                    one1.setVisibility(View.GONE);
                    two2.setVisibility(View.GONE);
                    three3.setVisibility(View.VISIBLE);
                    four4.setVisibility(View.GONE);
                    five5.setVisibility(View.GONE);
                    six6.setVisibility(View.GONE);
                }if (num == 4) {
                    one1.setVisibility(View.GONE);
                    two2.setVisibility(View.GONE);
                    three3.setVisibility(View.GONE);
                    four4.setVisibility(View.VISIBLE);
                    five5.setVisibility(View.GONE);
                    six6.setVisibility(View.GONE);
                }if (num == 5) {
                    one1.setVisibility(View.GONE);
                    two2.setVisibility(View.GONE);
                    three3.setVisibility(View.GONE);
                    four4.setVisibility(View.GONE);
                    five5.setVisibility(View.VISIBLE);
                    six6.setVisibility(View.GONE);
                }
                if (num == 6) {
                    one1.setVisibility(View.GONE);
                    two2.setVisibility(View.GONE);
                    three3.setVisibility(View.GONE);
                    four4.setVisibility(View.GONE);
                    five5.setVisibility(View.GONE);
                    six6.setVisibility(View.VISIBLE);
                }
*/

                    toast.setText("your toss is :- "+ num);
                    Vibrator v = (Vibrator) getSystemService(VIBRATOR_SERVICE);
                    v.vibrate(50);






            }

        });
    }


}