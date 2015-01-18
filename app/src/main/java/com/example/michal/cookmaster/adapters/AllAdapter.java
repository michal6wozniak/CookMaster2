package com.example.michal.cookmaster.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;


import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;

import java.util.ArrayList;
import java.util.List;

import com.example.michal.cookmaster.activities.AllRecipes;
import com.example.michal.cookmaster.activities.Recipes;
import com.example.michal.cookmaster.activities.RecipesItemView;



@EBean
public class AllAdapter extends BaseAdapter {

    @RootContext
    Context context;
    List<Recipes> recipes = new ArrayList<Recipes>();

    public AllAdapter() {
    }

    @Override
    public int getCount() {
        return recipes.size();
    }

    @Override
    public Recipes getItem(int i) {
        return recipes.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

         recipesItemView;
        if (convertView == null) {
            recipesItemView = RecipesItemView_.build(context);
        } else {
            recipesItemView = (RecipesItemView) convertView;
        }

        recipesItemView.bind(getItem(position));

        return recipesItemView;

        public void update(AllRecipes allRecipes) {
            recipes.clear();
            recipes.addAll(allRecipes.records);
            notifyDataSetChanged();
        }

    }