package repository

import com.example.common2.Note
import db.dbQuery
import db.table.Notes
import db.table.toNote
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