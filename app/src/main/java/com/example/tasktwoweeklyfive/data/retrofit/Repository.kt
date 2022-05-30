package com.example.tasktwoweeklyfive.data.retrofit

object Repository {

    private const val baseURL = "https://www.simplifiedcoding.net/demos/"

    val retrofitService: ApiService
        get() = RetrofitFactory.getClient(baseURL).create(ApiService::class.java)
}