package com.codepath.babak.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("W5RsgxWKHhFuhAurA473q2LEgiOZD3Aibz0XlsRe")
                .clientKey("V0qIM6Pa6kEprGz3QNJ0lev9dJsgujtRcbOYhsCW")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
