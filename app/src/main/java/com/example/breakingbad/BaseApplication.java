package com.example.breakingbad;

import android.app.Application;

import com.example.breakingbad.di.component.AppComponent;
import com.example.breakingbad.di.component.DaggerAppComponent;

public class BaseApplication extends Application {
    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.create();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
