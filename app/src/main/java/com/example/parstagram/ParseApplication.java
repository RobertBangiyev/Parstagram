package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("1nACSWqaFhZi2rwnNCLavrWrk19gkETSryX389Rw")
                .clientKey("dBreIMFwCAqel42Rba1NeIMsAb7gYxEc2ilVU0FT")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
