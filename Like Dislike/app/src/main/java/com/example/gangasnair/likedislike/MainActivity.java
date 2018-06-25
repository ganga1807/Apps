package com.example.gangasnair.likedislike;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

import java.lang.reflect.Field;
import java.util.Random;

public class MainActivity extends Activity implements OnClickListener {


    Button b1,b2;
    ImageView img,dimg;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(this);
        b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(this);

        img = (ImageView) findViewById(R.id.icon);
        dimg = (ImageView) findViewById(R.id.image);
    }

    int[] like = {R.drawable.piano, R.drawable.rubiks, R.drawable.pizza,R.drawable.tom};
    int[] dislike = {R.drawable.pom, R.drawable.shin, R.drawable.spider,R.drawable.chemistry};
    Random r = new Random();


    @Override
    public void onClick(View v) {

        if (v == b1) {
            int n = r.nextInt(4);
            img.setImageResource(like[n]);

        }
        if (v == b2) {
            int n = r.nextInt(4);
            dimg.setImageResource(dislike[n]);

        }

    }
}
