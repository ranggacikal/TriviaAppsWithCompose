package com.ranggacikal.triviaapps.di

import com.ranggacikal.triviaapps.network.QuestionApi
import com.ranggacikal.triviaapps.repository.QuestionRepository
import com.ranggacikal.triviaapps.util.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideQuestionRepository(api: QuestionApi): QuestionRepository {
        return QuestionRepository(api)
    }

    @Provides
    @Singleton
    fun provideQuestionApi(): QuestionApi {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(QuestionApi::class.java)
    }
}