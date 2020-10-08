package com.example.breakingbad.di.component;

import com.example.breakingbad.di.module.APIServiceModule;
import com.example.breakingbad.di.module.ApplicationModule;
import com.example.breakingbad.ui.view.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {APIServiceModule.class, ApplicationModule.class})
public interface AppComponent {

    void inject(MainActivity mainActivity);
}
