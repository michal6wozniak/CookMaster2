package com.example.michal.cookmaster.activities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Michal on 2015-01-18.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Recipes {

    public String title;
    public String introduction;
    public String ingredients;
    public String steps;
    public Integer preparationMinutes;
    public Integer cookingMinutes;
    public Integer servings;

    @JsonIgnore
    public String pictureBytes;

}
