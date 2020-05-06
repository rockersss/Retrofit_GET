package com.example.retrofit_get;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderAPI {

    @GET()
    Call<List<Post>> getPosts();

}
