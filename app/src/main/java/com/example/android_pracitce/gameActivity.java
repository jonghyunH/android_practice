package com.example.android_pracitce;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class gameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity);

        ImageButton btn1 = findViewById(R.id.imageButton1);
        ImageButton btn2 = findViewById(R.id.imageButton2);
        ImageButton btn3 = findViewById(R.id.imageButton3);
        ImageButton btn4 = findViewById(R.id.imageButton4);
        ImageButton btn5 = findViewById(R.id.imageButton5);
        ImageButton btn6 = findViewById(R.id.imageButton6);
        ImageButton btn7 = findViewById(R.id.imageButton7);
        ImageButton btn8 = findViewById(R.id.imageButton8);

        final View box = findViewById(R.id.box);

        //위 305
        //아래 685
        //왼 42
        //오 880

        btn1.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View v){
                int[] location = new int[2];
                box.getLocationOnScreen(location);
                if(location[0] > 42 && location[1] > 305) {
                    box.setX(location[0] - 30);
                    box.setY(location[1] - 300);
                }

                System.out.println("x " + location[0] + " y " + location[1]);
            }
        });

        btn2.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View v){
                int[] location = new int[2];
                box.getLocationOnScreen(location);
                if(location[1] > 305) {
                    box.setY(location[1] - 300);
                }

                System.out.println("x " + location[0] + " y " + location[1]);
            }
        });

        btn3.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View v){
                int[] location = new int[2];
                box.getLocationOnScreen(location);
                if(location[0] < 880 && location[1] > 305) {
                    box.setX(location[0] + 30);
                    box.setY(location[1] - 300);
                }

                System.out.println("x " + location[0] + " y " + location[1]);
            }
        });

        btn4.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View v){
                int[] location = new int[2];
                box.getLocationOnScreen(location);
                if(location[0] > 42) {
                    box.setX(location[0] - 30);
                }

                System.out.println("x " + location[0] + " y " + location[1]);
            }
        });

        btn5.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View v){
                int[] location = new int[2];
                box.getLocationOnScreen(location);
                if(location[0] < 880) {
                    box.setX(location[0] + 30);
                }

                System.out.println("x " + location[0] + " y " + location[1]);
            }
        });

        btn6.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View v){
                int[] location = new int[2];
                box.getLocationOnScreen(location);
                if(location[0] > 42 && location[1] < 685) {
                    box.setX(location[0] - 30);
                    box.setY(location[1] - 200);
                }

                System.out.println("x " + location[0] + " y " + location[1]);
            }
        });

        btn7.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View v){
                int[] location = new int[2];
                box.getLocationOnScreen(location);
                if(location[1] < 685) {
                    box.setY(location[1] - 200);
                }

                System.out.println("x " + location[0] + " y " + location[1]);
            }
        });
        btn8.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View v){
                int[] location = new int[2];
                box.getLocationOnScreen(location);

                if(location[0] < 880 && location[1] < 685){
                    box.setX(location[0]+30);
                    box.setY(location[1]-200);
                }

                System.out.println("x " + location[0] + " y " + location[1]);
            }
        });

    }

}
