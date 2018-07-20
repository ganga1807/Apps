package com.example.ganga.awesomefruits;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Fruits> fruits = new ArrayList<Fruits>();
        fruits.add(new Fruits("Apple",R.drawable.apple));
        fruits.add(new Fruits("Avocado",R.drawable.avocado));
        fruits.add(new Fruits("Banana",R.drawable.banana));
        fruits.add(new Fruits("Cherry",R.drawable.cherry));
        fruits.add(new Fruits("Coconut",R.drawable.coconut));
        fruits.add(new Fruits("Grapes",R.drawable.grapes));
        fruits.add(new Fruits("Kiwi",R.drawable.kiwi));
        fruits.add(new Fruits("Lemon",R.drawable.lemon));
        fruits.add(new Fruits("Olive",R.drawable.olive));
        fruits.add(new Fruits("Papaya",R.drawable.papaya));
        fruits.add(new Fruits("Pear",R.drawable.pear));
        fruits.add(new Fruits("Pineapple",R.drawable.pineapple));
        fruits.add(new Fruits("Pomegranate",R.drawable.pomegranate));
        fruits.add(new Fruits("Raspberry",R.drawable.raspberry));
        fruits.add(new Fruits("Strawberry",R.drawable.strawberry));
        fruits.add(new Fruits("Watermelon",R.drawable.watermelon));






        FruitsAdapter fruitAdapter = new FruitsAdapter(this, fruits);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(fruitAdapter);



    }

}
