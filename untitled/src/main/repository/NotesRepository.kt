package main.repository

import com.example.common2.Note
import main.db.dbQuery
import main.db.table.Notes
import main.db.table.toNote
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