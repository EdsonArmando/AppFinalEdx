package com.android.guix.edson.org.appfinal;

import android.app.Application;

/**
 * Created by Armando on 20/07/2016.
 */
public class KinalApp extends Application {
    private final static String ABOUT_URL = "http://coordinacionkinal.jimdo.com/";

    public String getAboutUrl() {
        return ABOUT_URL;
    }
}
