package com.example.michal.cookmaster.activities;

import android.graphics.Picture;


import com.example.michal.cookmaster.RestClient;
package com.example.michal.cookmaster.activities.Picture;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.rest.RestService;

@EBean
public class RestBackgroundTask {

    @RootContext
    AllActivity activity;

    @RestService
    RestClient restClient;

    @Background
    void getPhoneBook() {
        try {
            restClient.setHeader("X-Dreamfactory-Application-Name", "recipes");
            AllActivity allRecipes = restClient.getRecipes();
            for (Recipes recipes: allRecipes.records) {
                if (recipes.pictureId != null) {
                    Picture picture = restClient.getPictureById(recipes.pictureId);
                    recipes.pictureBytes = recipes.base64bytes;
                }
            }
            publishResult(allRecipes);
        } catch (Exception e) {
            publishError(e);
        }
    }

    @Background
    void addRecipes(Recipes recipe) {
        try {
            restClient.setHeader("X-Dreamfactory-Application-Name", "recipes");
            restClient.addRecipe(recipe);
            AllActivity theAllRecipes = restClient.getRecipes();
            publishResult(theAllRecipes);
        } catch (Exception e) {
            publishError(e);
        }
    }

    @UiThread
    void publishResult(AllActivity allRecipes) {
        activity.updateAllRecipes(allRecipes);
    }

    @UiThread
    void publishError(Exception e) {
        activity.showError(e);
    }

}
