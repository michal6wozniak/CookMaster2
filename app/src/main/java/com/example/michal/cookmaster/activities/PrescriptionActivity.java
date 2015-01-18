package com.example.michal.cookmaster.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.michal.cookmaster.R;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Michal on 2015-01-17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PrescriptionActivity extends Activity {

    public String title;
    public String introduction;
    public String ingredients;
    public String steps;
    public String preparationTime;
    public String cookingTime;
    public String servings;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prescription_view);
    }
    public void prescriptionClick (View view) {
        Intent getPrescriptionScreen = new Intent(this, PrescriptionActivity.class);

        final int result = 1;

        startActivity(getPrescriptionScreen);
    }

}
