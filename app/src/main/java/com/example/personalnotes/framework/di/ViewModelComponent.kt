package com.example.personalnotes.framework.di

import com.example.personalnotes.framework.ListViewModel
import com.example.personalnotes.framework.NoteViewModel
import dagger.Component

@Component(modules = [ApplicationModule::class, RepositoryModule::class, UseCasesModule::class])
interface ViewModelComponent {
    fun inject(noteViewModel: NoteViewModel)
    fun inject(listViewModel: ListViewModel)
}