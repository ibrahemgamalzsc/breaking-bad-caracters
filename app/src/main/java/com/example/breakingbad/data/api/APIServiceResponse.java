package com.example.breakingbad.data.api;

import com.example.breakingbad.data.pojo.Characters;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIServiceResponse {

    @GET("characters")
    Call<List<Characters>> getAllCharacters();
}
