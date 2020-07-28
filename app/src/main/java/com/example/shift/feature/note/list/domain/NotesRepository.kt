package com.example.shift.feature.note.list.domain

import com.example.common2.Note

interface NotesRepository {

    fun getNotes() : List<Note>
}