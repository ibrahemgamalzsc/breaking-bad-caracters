package com.example.breakingbad.ui.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.breakingbad.data.pojo.Characters;
import com.example.breakingbad.data.repo.APIResponseRepo;

import java.util.List;

import javax.inject.Inject;

public class MainViewModel extends ViewModel {
    private final APIResponseRepo apiResponseRepo;

    @Inject
    public MainViewModel(APIResponseRepo apiResponseRepo) {
        this.apiResponseRepo = apiResponseRepo;
    }

    public LiveData<List<Characters>> getAllCharacters(){
        return apiResponseRepo.getGetAllCharacters();
    }
}
