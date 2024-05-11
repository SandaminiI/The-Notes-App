package com.example.thenotesapp.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.thenotesapp.repository.NoteRepository

class NoteViewModelFactory(val app:Application,private val noteRepository: NoteRepository ):ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>):T{
        return NoteViewModel(app,noteRepository) as T
    }
}
