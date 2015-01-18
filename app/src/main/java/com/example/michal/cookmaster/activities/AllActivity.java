package com.example.michal.cookmaster.activities;


import android.app.ProgressDialog;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;
import android.widget.Toast;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.ItemClick;
import org.androidannotations.annotations.NonConfigurationInstance;
import org.androidannotations.annotations.OptionsItem;
import org.androidannotations.annotations.OptionsMenu;
import org.androidannotations.annotations.ViewById;


import com.example.michal.cookmaster.R;
import com.example.michal.cookmaster.Recipes;
import com.example.michal.cookmaster.AllRecipes;
import com.example.michal.cookmaster.UserName;
import com.example.michal.cookmaster.adapters.AllAdapter;
import com.example.michal.cookmaster.RecipesItemView;
import com.example.michal.cookmaster.RecipesItemView_;



@EActivity(R.layout.activity_all)
@OptionsMenu(R.menu.menu_favourite)
public class AllActivity extends ActionBarActivity {

@Extra
UserName userName;

@ViewById
ListView list;

@Bean
AllAdapter adapter;

@Bean
@NonConfigurationInstance
RestBackgroundTask restBackgroundTask;

ProgressDialog ringProgressDialog;

@AfterViews
    void init() {
        list.setAdapter(adapter);
        ringProgressDialog = new ProgressDialog(this);
        ringProgressDialog.setMessage("Loading...");
        ringProgressDialog.setIndeterminate(true);
        Toast.makeText(this, userName.sessionId, Toast.LENGTH_LONG).show();
    }

@ItemClick
    void listItemClicked(Recipes item) {
        Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show();
    }

@Click
    void allClick()    {
        ringProgressDialog.show();
        restBackgroundTask.getRecipes();
    }

public void updateAllRecipes (AllActivity allRecipes){
    ringProgressDialog.dismiss();
    adapter.update(allRecipes);

public void showError(Exception e) {
        ringProgressDialog.dismiss();
        Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
        e.printStackTrace();
}
    @OptionsItem
    void settingsSelected() {
    }


}