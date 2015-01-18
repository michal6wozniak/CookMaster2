package com.example.michal.cookmaster.activities;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.michal.cookmaster.R;

import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;



@EViewGroup(R.layout.all_list_view)
public class RecipesItemView extends RelativeLayout {

    @ViewById
    ImageView avatar;

    @ViewById
    TextView title;



    public RecipesItemView(Context context) {
        super(context);
    }

    public void bind(Recipes recipes) {
        title.setText(recipes.title);
        if (recipes.pictureBytes != null) {
            decodeAndSetImage(recipes.pictureBytes, avatar);
        } else {
            avatar.setImageDrawable(null);
        }
    }

    private void decodeAndSetImage(String base64bytes, ImageView image) {
        // zamień ciąg tekstowy Base-64 na tablicę bajtów
        byte[] decodedString = Base64.decode(base64bytes, Base64.DEFAULT);
        // utwórz bitmapę na podstawie ciągu bajtów z obrazem JPEG
        Bitmap decodedBytes = BitmapFactory.decodeByteArray(decodedString, 0, decodedString.length);
        // wstaw bitmapę do komponentu ImageView awatara
        image.setImageBitmap(decodedBytes);
    }

}