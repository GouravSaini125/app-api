package com.example.test;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    String BASE_URL = "http://quiz-restapi.herokuapp.com/?format=json";

    @GET("/")
    Call<List<Subject>> getSubjects();

    @GET("module")
    Call<List<Module>> getModules();

    @GET("topic")
    Call<List<Module>> getTopics();

}
