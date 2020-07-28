package main.kotlin.db.table

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table

object Notes : Table() {
    val id: Column<Long> = Notes.long("id").autoIncrement().primaryKey()
    val title: Column<String> = Notes.varchar("title", 100)
    val description: Column<String> = Notes.varchar("description", 1024)
}