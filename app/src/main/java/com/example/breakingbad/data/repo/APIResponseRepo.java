package com.example.breakingbad.data.repo;

import androidx.lifecycle.MutableLiveData;

import com.example.breakingbad.data.api.APIServiceResponse;
import com.example.breakingbad.data.pojo.Characters;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class APIResponseRepo {
    private final APIServiceResponse apiServiceResponse;
    MutableLiveData<List<Characters>> getAllCharacters = new MutableLiveData<>();

    @Inject
    public APIResponseRepo(APIServiceResponse apiServiceResponse) {
        this.apiServiceResponse = apiServiceResponse;
    }

    public void getAllCharacters() {
        apiServiceResponse.getAllCharacters().enqueue(new Callback<List<Characters>>() {
            @Override
            public void onResponse(Call<List<Characters>> call, Response<List<Characters>> response) {
                if (response.isSuccessful()) {
                    getAllCharacters.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<List<Characters>> call, Throwable t) {

            }
        });
    }

    public MutableLiveData<List<Characters>> getGetAllCharacters() {
        getAllCharacters();
        return getAllCharacters;
    }
}
