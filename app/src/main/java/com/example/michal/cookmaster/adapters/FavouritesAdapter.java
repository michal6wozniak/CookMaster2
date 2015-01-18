package com.example.michal.cookmaster.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.michal.cookmaster.R;

class FavouritesAdapter extends ArrayAdapter <String> {
    public FavouritesAdapter(Context context, String[] values) {
        super(context, R.layout.favourites_list_picture, values);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater theInflater = LayoutInflater.from(getContext());

        View theView = theInflater.inflate(R.layout.favourites_list_picture, parent, false);
        String favouritesListElements = getItem(position);
        TextView theTextView = (TextView) theView.findViewById(R.id.favourites_list_text);
        theTextView.setText(favouritesListElements);
        ImageView theImageView = (ImageView) theView.findViewById(R.id.imagine_view1);

       return theView;
    }
}
