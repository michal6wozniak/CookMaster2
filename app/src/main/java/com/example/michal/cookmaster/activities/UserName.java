package com.example.michal.cookmaster.activities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by Michal on 2015-01-17.
 */

    import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
    import com.fasterxml.jackson.annotation.JsonProperty;

    import java.io.Serializable;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public class UserName implements Serializable {

        public Integer id;

        @JsonProperty("session_id")
        public String sessionId;

    }

