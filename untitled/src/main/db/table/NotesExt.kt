package main.db.table

import com.example.common2.Note
import org.jetbrains.exposed.sql.ResultRow

fun ResultRow.toNote() = Note(
    id = this[Notes.id],
    title = this[Notes.title],
    description = this[Notes.description]
)