package com.example.shift.feature.note.list.domain

import com.example.common2.Note

class GetNotesUseCase(
    private val notesRepository: NotesRepository
) {

    operator fun invoke(): List<Note> = notesRepository.getNotes()
}