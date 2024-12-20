package com.ranggacikal.triviaapps.repository

import android.util.Log
import com.ranggacikal.triviaapps.data.DataOrException
import com.ranggacikal.triviaapps.model.QuestionItem
import com.ranggacikal.triviaapps.network.QuestionApi
import javax.inject.Inject

class QuestionRepository @Inject constructor(private val api: QuestionApi) {

    private val dataOrException = DataOrException<ArrayList<QuestionItem>, Boolean, Exception>()

    suspend fun getAllQuestion(): DataOrException<ArrayList<QuestionItem>, Boolean, Exception> {
        try {
            dataOrException.isLoading = true
            dataOrException.data = api.getAllQuestion()
            if (dataOrException.data.toString().isNotEmpty()) dataOrException.isLoading = false
        } catch (exception: Exception) {
            dataOrException.e = exception
            Log.d("Exc", "getAllQuestion: ${dataOrException.e?.localizedMessage}")
        }
        return dataOrException
    }

}