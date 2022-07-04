package com.example.roomapp.screens.start

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.roomapp.REPOSITORY
import com.example.roomapp.db.NoteDatabase
import com.example.roomapp.db.repository.NoteRealization
import com.example.roomapp.model.NoteModel

class StartViewModel(application: Application): AndroidViewModel(application)  {

    val context = application


    fun initDatabase(){
        val daoNote = NoteDatabase.getInstance(context).getNoteDao()
        REPOSITORY = NoteRealization(daoNote)

    }
    fun getAllNotes(): LiveData<List<NoteModel>>{

        return REPOSITORY.allNotes
    }

}