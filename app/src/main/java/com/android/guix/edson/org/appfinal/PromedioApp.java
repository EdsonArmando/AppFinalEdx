package com.android.guix.edson.org.appfinal;

import android.app.Application;

/**
 * Created by Armando on 19/07/2016.
 */
public class PromedioApp extends Application {
    private final static String ABOUT_URL = "http://www.kinal.org.gt/";

    public String getAboutUrl() {
        return ABOUT_URL;
    }
}
