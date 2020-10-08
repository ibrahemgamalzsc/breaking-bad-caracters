package com.example.breakingbad.di.module;

import com.example.breakingbad.data.api.APIServiceResponse;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module(includes = ViewModelModule.class)
public abstract class APIServiceModule {
    public static final String BASE_URL="https://breakingbadapi.com/api/";

    @Provides
    @Singleton
    static Retrofit provideRetrofit(){
        return new Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Provides
    @Singleton
    static APIServiceResponse provideAPIServiceResponse(Retrofit retrofit){
        return retrofit.create(APIServiceResponse.class);
    }
}
