package com.example.michal.cookmaster.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.michal.cookmaster.R;


/**
 * Created by Michal on 2015-01-14.
 */
public class AddActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_add);


    }


    public void favouritesClick(View view) {
        Intent getFavouriteScreen = new Intent(this, FavouriteActivity.class);

       final int result = 1;

        startActivity(getFavouriteScreen);
    }

    public void allClick(View view) {
        Intent getAllScreen = new Intent(this, AllActivity.class);

        final int result = 1;

        startActivity(getAllScreen);

    }

    public void tempClick(View view) {
        Intent getAllScreen = new Intent(this, PrescriptionActivity.class);

        final int result = 1;

        startActivity(getAllScreen);
    }
}
