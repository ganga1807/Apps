package com.example.ganga.awesomefruits;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class FruitsAdapter extends ArrayAdapter<Fruits> {

    public FruitsAdapter(Activity context, ArrayList<Fruits> fruits) {
        super(context, 0, fruits);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Fruits currentFruit = getItem(position);
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.fruit_text_view);
        defaultTextView.setText(currentFruit.getFruitName());


        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentFruit.hasImage()) {

            imageView.setImageResource(currentFruit.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}

