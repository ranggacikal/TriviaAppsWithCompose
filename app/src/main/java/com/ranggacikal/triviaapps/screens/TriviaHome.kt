package com.ranggacikal.triviaapps.screens

import androidx.compose.runtime.Composable
import com.ranggacikal.triviaapps.component.Questions


@Composable
fun TriviaHome(viewModel: QuestionViewModel) {
    Questions(viewModel)
}