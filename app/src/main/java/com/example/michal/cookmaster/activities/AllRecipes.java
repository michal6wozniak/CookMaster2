package com.example.michal.cookmaster.activities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michal on 2015-01-18.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AllRecipes {

    @JsonProperty("record")
    public List<Recipes> records = new ArrayList<Recipes>();
}
