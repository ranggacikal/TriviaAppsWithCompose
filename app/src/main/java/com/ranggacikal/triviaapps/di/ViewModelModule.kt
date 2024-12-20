package com.ranggacikal.triviaapps.di

import androidx.lifecycle.ViewModel
import com.ranggacikal.triviaapps.screens.QuestionViewModel
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.multibindings.IntoMap

@Module
@InstallIn(ViewModelComponent::class)
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(QuestionViewModel::class)
    abstract fun bindQuestionViewModel(viewModel: QuestionViewModel): ViewModel

}