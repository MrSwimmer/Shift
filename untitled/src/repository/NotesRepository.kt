package com.example.repository

import com.example.common2.Note
import com.example.db.dbQuery
import com.example.db.table.Notes
import com.example.db.table.toNote
import org.jetbrains.exposed.sql.selectAll

class NotesRepository {
    suspend fun getAll() =
        dbQuery {
            Notes.selectAll().map { it.toNote() }
        }

    fun add(note: Note) {

    }

    fun delete(id: Long) {

    }
}