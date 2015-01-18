package com.example.michal.cookmaster;

import android.graphics.Picture;

import com.example.michal.cookmaster.activities.AllActivity;
import com.example.michal.cookmaster.activities.LoginActivity;
import com.example.michal.cookmaster.activities.PrescriptionActivity;
import com.example.michal.cookmaster.activities.Recipes;
import com.example.michal.cookmaster.activities.UserName;


import org.androidannotations.annotations.rest.Get;
import org.androidannotations.annotations.rest.Post;
import org.androidannotations.annotations.rest.RequiresHeader;
import org.androidannotations.annotations.rest.Rest;
import org.androidannotations.api.rest.RestClientHeaders;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;


@Rest(rootUrl = "http://pegaz.wzr.ug.edu.pl:8080/rest",
        converters = { MappingJackson2HttpMessageConverter.class })
@RequiresHeader({"X-Dreamfactory-Application-Name"})
public interface RestClient extends RestClientHeaders {

    @Get("/db/recipes")
    AllActivity getRecipes();

    @Post("/db/recipes")
    void addRecipe(Recipes recipe);

    @Post("/user/session")
    UserName login(EmailAndPassword postLogin);

    @Get("/db/pictures/{id}")
    Picture getPictureById(int id);

}