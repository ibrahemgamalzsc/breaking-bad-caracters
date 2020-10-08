package com.example.breakingbad.di.module;


import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.breakingbad.di.annotation.ViewModelKey;
import com.example.breakingbad.ui.viewmodel.MainViewModel;
import com.example.breakingbad.ui.viewmodel.ViewModelFactory;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel.class)
    abstract ViewModel provideViewModel(MainViewModel mainViewModel);

    @Binds
    abstract ViewModelProvider.Factory factory(ViewModelFactory viewModelFactory);
}
