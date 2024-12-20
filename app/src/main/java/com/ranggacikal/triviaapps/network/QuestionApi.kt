package com.ranggacikal.triviaapps.network

import com.ranggacikal.triviaapps.model.Question
import retrofit2.http.GET
import javax.inject.Singleton

@Singleton
interface QuestionApi {
    @GET("world.json")
    suspend fun getAllQuestion(): Question
}