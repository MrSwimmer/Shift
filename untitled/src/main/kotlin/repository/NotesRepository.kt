package main.kotlin.repository

import com.example.common2.Note
import main.kotlin.db.dbQuery
import main.kotlin.db.table.Notes
import main.kotlin.db.table.toNote
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