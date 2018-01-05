package com.example.bittu.jaipur;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place>{


    public PlaceAdapter(Context context, ArrayList<Place> places) {
        super(context,0,places);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        final Place currentPlace = getItem(position);

        TextView title = (TextView)listItemView.findViewById(R.id.title);
        title.setText(currentPlace.getTitle());

        TextView description = (TextView)listItemView.findViewById(R.id.description);
        description.setText(currentPlace.getDescription());



        ImageView imageView= (ImageView)listItemView.findViewById(R.id.imageView);
        imageView.setImageResource(currentPlace.getImageResourceId());



        if(imageView.getDrawable() == null){
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
