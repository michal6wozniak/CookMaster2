package com.example.michal.cookmaster.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.michal.cookmaster.FavouritesAdapter;
import com.example.michal.cookmaster.R;


public class FavouriteActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite);

        String[] favouritesListElements = {"Przepis 1", "Przepis 2",
                "Przepis 3", "Przepis 4", "Przepis 5", "Przepis 5", "Przepis 5", "Przepis 5", "Przepis 5", "Przepis 5"};

        ListAdapter listAdapter = new FavouritesAdapter(this,favouritesListElements);

        ListView favouritesList = (ListView)findViewById(R.id.favourites_list);

        favouritesList.setAdapter(listAdapter);

        favouritesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String favouritesPicked = "You selected";
                Toast.makeText(FavouriteActivity.this,favouritesPicked, Toast.LENGTH_LONG).show();

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_favourite, menu);
        return true;

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void addClick(View view) {
        Intent addViewIntent = new Intent(this,LoginActivity.class);

        final int result = 1;

        startActivity(addViewIntent);
    }

    public void allClick(View view) {
        Intent addViewIntent = new Intent(this,AllActivity.class);

        final int result = 1;

        startActivity(addViewIntent);
    }

    public void favouritesClick(View view) {
        Intent addViewIntent = new Intent(this,FavouriteActivity.class);

        final int result = 1;

        startActivity(addViewIntent);
    }
}
