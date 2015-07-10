package com.crimson.ribbit;

import android.app.Application;

import com.parse.Parse;

public class RibbitApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "pKh0DXuP1aMA9cO5Yu7qdfJkq5yPJ6rQLbIwgDtk", "d5OttfljWhSDkpgLiWnx17U98Yo14CIxLswWXDDg");
    }
}