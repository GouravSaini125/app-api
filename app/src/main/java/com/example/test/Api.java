package com.example.test;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Api {

    String BASE_URL = "http://quiz-restapi.herokuapp.com/?format=json";

    @GET("/")
    Call<List<Subject>> getSubjects();

    @GET("module")
    Call<List<Module>> getModules(@Query("search") int id);

    @GET("topic")
    Call<List<Module>> getTopics(@Query("search") int id);

    @GET("question")
    Call<List<Module>> getQuestions(@Query("search") int id);

    @GET("choice")
    Call<List<Choice>> getChoices(@Query("search") int id);

}