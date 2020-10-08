package com.example.breakingbad.di.module;

import android.app.Application;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ApplicationModule {

    private final Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }

    @Binds
    abstract Application provideApplication(Application application);
}
