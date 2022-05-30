package com.example.tasktwoweeklyfive.data.retrofit

import com.example.tasktwoweeklyfive.data.model.Movie
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("marvel")
     fun getMovieList(): Call<MutableList<Movie>>
}